package com.workintech.fswebs17d1.controller;
import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping
    public List<Animal> getAll() {
        return new ArrayList<>(animals.values());
    }
    @GetMapping("/{id}")
    public Animal getById(@PathVariable int id) {
        return animals.get(id);
    }
    @PostMapping
    public Animal save(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
        return animal;
    }
    @PutMapping("/{id}")
    public Animal update(@PathVariable int id, @RequestBody Animal updatedAnimal) {
        animals.put(id, updatedAnimal);
        return updatedAnimal;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        animals.remove(id);
        return "Animal with ID " + id + " silindi.";
    }
}
