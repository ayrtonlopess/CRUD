package br.com.projeto.cartoriosimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.cartoriosimple.model.Cartorios;
import br.com.projeto.cartoriosimple.repository.CartoriosRepository;

@Service
public class CartoriosService {

	@Autowired
	private CartoriosRepository cartoriosRepository;

	public void criar(Cartorios cartorios) {
		cartoriosRepository.save(cartorios);
	}

	public List<Cartorios> listar() {
		return cartoriosRepository.findAll();
	}

	public Cartorios buscar(Long id) {
		return cartoriosRepository.getOne(id);
	}

	public void excluir(Long id) {
		cartoriosRepository.delete(buscar(id));
	}

}
