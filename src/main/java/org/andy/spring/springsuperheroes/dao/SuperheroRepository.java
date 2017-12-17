package org.andy.spring.springsuperheroes.dao;

import org.andy.spring.springsuperheroes.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {

}
