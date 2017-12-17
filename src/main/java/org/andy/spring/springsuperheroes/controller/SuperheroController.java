package org.andy.spring.springsuperheroes.controller;

import org.andy.spring.springsuperheroes.dao.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/superhero")
public class SuperheroController {

    @Autowired
    private SuperheroRepository superheroRepository;

    @RequestMapping
    public ModelAndView getSuperheroes() {
        return new ModelAndView("superheroes", "superheroes", this.superheroRepository.findAll());
    }
}
