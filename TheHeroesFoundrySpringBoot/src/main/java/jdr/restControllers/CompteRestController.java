package jdr.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import jdr.entity.Compte;
import jdr.entity.JsonViews;
import jdr.services.CompteService;

@RestController
@RequestMapping("/api/compte")
public class CompteRestController {

	@Autowired
	private CompteService compteService;

	@JsonView(JsonViews.Common.class)
	@GetMapping("")
	public List<Compte> getAll() {
		return compteService.getAll();
	}

	@JsonView(JsonViews.Common.class)
	@PostMapping("")
	public Compte create(@RequestBody Compte compte) {
		return compteService.create(compte);
	}

}
//Il ne nous manque pas l'option se connecter ? Pour joueur comme pur admin ? 