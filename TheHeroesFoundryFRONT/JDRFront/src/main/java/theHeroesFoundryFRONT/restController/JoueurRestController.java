package theHeroesFoundryFRONT.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import jdr.entity.Joueur;
import quest.entity.Formateur;
import quest.entity.JsonViews;
import quest.services.CompteService;

@RestController
@RequestMapping("/api/joueur")
@CrossOrigin(origins = "*")
public class JoueurRestController {

	@Autowired
	private CompteService compteService;

	@GetMapping("")
	@JsonView(JsonViews.Common.class)
	public List<Joueur> getAll() {
		return compteRepository.getAllJoueurs();
	}

	@GetMapping("/{id}")
	@JsonView(JsonViews.Common.class)
	public Formateur getById(@PathVariable Long id) {
		return (Joueur) compteRepository.getById(id);
	}

	@GetMapping("/{id}/modules")
	@JsonView(JsonViews.FormateurWithModules.class)
	public Formateur getByIdWithModules(@PathVariable Long id) {
		return compteService.getByIdWithModules(id);
	}

}
