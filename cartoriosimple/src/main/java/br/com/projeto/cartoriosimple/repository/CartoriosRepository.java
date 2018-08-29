package br.com.projeto.cartoriosimple.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.cartoriosimple.model.Cartorios;

@Repository
public interface CartoriosRepository extends JpaRepository<Cartorios, Long> {

	List<Cartorios> findByNome(String nome);

}
