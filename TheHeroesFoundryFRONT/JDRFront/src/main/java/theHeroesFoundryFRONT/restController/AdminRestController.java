package theHeroesFoundryFRONT.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import quest.entity.Formateur;
import quest.entity.JsonViews;
import quest.services.CompteService;

public class AdminRestController {

	@RestController
	@RequestMapping("/api/formateur")
	@CrossOrigin(origins = "*")
	public class FormateurRestController {

		@Autowired
		private CompteService compteService;

		}

		@GetMapping("/{id}")
		@JsonView(JsonViews.Common.class)
		public Admin getById(@PathVariable Long id) {
			return (Admin) compterepository.getById(id);
		}

		@GetMapping("/{id}/modules")
		@JsonView(JsonViews.FormateurWithModules.class)
		public Formateur getByIdWithModules(@PathVariable Long id) {
			return compteService.getByIdWithModules(id);
		}

	}
}
