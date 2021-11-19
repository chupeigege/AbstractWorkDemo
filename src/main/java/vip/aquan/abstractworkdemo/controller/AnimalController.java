package vip.aquan.abstractworkdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vip.aquan.abstractworkdemo.service.AnimalService;

/**
 * @author Chupei Wang
 * @since 2021/11/19
 */
@RestController
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(value = "/run/{type}")
    public Object run(@PathVariable Integer type) {
        animalService.run(type);
        return "run";
    }

    @GetMapping(value = "/eat/{type}")
    public Object eat(@PathVariable Integer type) {
        animalService.eat(type);
        return "eat";
    }

}
