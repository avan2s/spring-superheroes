package org.andy.spring.springsuperheroes.controller;

import org.andy.spring.springsuperheroes.model.Superhero;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/superhero")
public class SuperheroController {

    @RequestMapping
    public ModelAndView getSuperheroes() {
        List<Superhero> superheroList = Arrays.asList(
                new Superhero("Clark", "Kent", "Superman", true),
                new Superhero("Siobhan", "McDougal", "Silver Banshee", false)
        );
        return new ModelAndView("superheroes", "superheroes", superheroList);
    }
}
