package com.claudiocarige.projetoclaudiospringboot.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiocarige.projetoclaudiospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	/*Não precisará criar a implementação pois o SpringDataJPA já
	 * tem uma implementação padrão para interface */
}
