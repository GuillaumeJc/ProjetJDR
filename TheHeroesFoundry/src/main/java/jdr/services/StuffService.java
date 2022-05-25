package jdr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import jdr.entity.Stuff;
import jdr.exceptions.StuffException;
import jdr.repositories.StuffRepository;

public class StuffService {

	@Autowired
	private StuffRepository stuffRepository;

	public List<Stuff> getAll() {
		return stuffRepository.findAll();
	}

	public Stuff getById(Long id) {
		return stuffRepository.findById(id).orElseThrow(StuffException::new);
	}

	public Stuff create(Stuff stuff) {
		return stuffRepository.save(stuff);
	}

	public Stuff update(Stuff stuff) {
		return stuffRepository.save(stuff);
	}

	public void delete(Stuff stuff) {
		stuffRepository.delete(stuff);
	}

	public void deleteById(Long id) {
		Stuff stuff = new Stuff();
		stuff.setId(id);
		delete(stuff);
	}
}
