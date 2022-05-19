package theHeroesFoundryFRONT.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import jdr.entity.Admin;
import jdr.entity.Boutique;
import jdr.entity.Compte;
import jdr.entity.Consommables;
import jdr.entity.Equipement;
import jdr.entity.Joueur;
import jdr.entity.JsonViews;
import jdr.services.BoutiqueService;
import jdr.services.CompteService;
import jdr.services.PersonnageService;
@RestController
@RequestMapping("/api/joueur")
@CrossOrigin(origins = "*")


public class AdminRestController {
	@Autowired
	private CompteService compteService;

	@Autowired
	private BoutiqueService boutiqueService; 
	
	@Autowired
	private PersonnageService personnageService; 

	
	// JOUEURS 
	
	
	@GetMapping("")
	@JsonView(JsonViews.Common.class)
	public List<Joueur> getAllJoueurs() {
		return compteService.getAllJoueurs();
	}

	@GetMapping("/{id}")
	@JsonView(JsonViews.Common.class)
	public Joueur getJoueurById(@PathVariable Long id) {
		return (Joueur) compteService.getById(id);
	}


	@GetMapping("/{id}/delete")
	@JsonView(JsonViews.Common.class) // /!\ Methode dans JsonView (entity)
	public void DeleteJoueurById(@PathVariable Long id) {
		compteService.deleteByIdJoueur(id);
	}
	
	
	//PERSONNAGES DU JOUEUR
	
	@GetMapping("/{id}/personnages")
	@JsonView(JsonViews.JoueurWithPersonnages.class) // /!\ Methode dans JsonView (entity)
	public Joueur getJoueurByIdWithPersonnages(@PathVariable Long id) {
		return compteService.getByIdWithPersonnages(id);
	}

	@GetMapping("/{id}/personnages/delete")
	@JsonView(JsonViews.JoueurWithPersonnages.class) // /!\ Methode dans JsonView (entity)
	public void DeletePersonnageById(@PathVariable Long id) {
		personnageService.deleteById(id);  //ALED OLIVIER
	}
	
	
	//BOUTIQUE

	@GetMapping("/boutique/gestion") //Ajouter un bouton de filtre pour séparer les consommables de l'équipement
	@JsonView(JsonViews.Common.class)
	public List<Boutique> getAllBoutique() {
		return boutiqueService.getAll();		
	}

	
	//CONSOMMABLES
	
	@GetMapping("/boutique/gestion/consommables")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public Consommables getAllConsommables() {        // Pourquoi pas possible d'avoir une liste ? 
		return (Consommables) boutiqueService.getAllConsommables();
	}

	@GetMapping("/boutique/gestion/consommables/creation")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public Consommables createConsommables() {        // Pourquoi pas possible d'avoir une liste ? 
		return (Consommables) boutiqueService.createConsommables(null); //Pourquoi null ?
	}
	
	@GetMapping("/boutique/gestion/consommables/update")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public Consommables updateConsommables() {        // Pourquoi pas possible d'avoir une liste ? 
		return (Consommables) boutiqueService.updateConsommables(null); //Pourquoi null ?
	}
	
	@GetMapping("/boutique/gestion/consommables/delete")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public void deleteByIdConsommables() {        // Pourquoi pas possible d'avoir une liste ? 
		boutiqueService.deleteByIdConsommables(null); //Pourquoi null ?
	}
	
	
	//EQUIPEMENT
	
	@GetMapping("/boutique/gestion/equipement")
	@JsonView(JsonViews.EquipementFromBoutique.class) 
	public Equipement getAllEquipement() {    // Pourquoi pas possible d'avoir une liste ? 
		return (Equipement) boutiqueService.getAllEquipement();
	}
	
	@GetMapping("/boutique/gestion/equipement/creation")
	@JsonView(JsonViews.EquipementFromBoutique.class) 
	public Equipement createEquipement() {        // Pourquoi pas possible d'avoir une liste ? 
		return (Equipement) boutiqueService.createEquipement(null); //Pourquoi null ?
	}
	
	@GetMapping("/boutique/gestion/equipement/update")
	@JsonView(JsonViews.EquipementFromBoutique.class) 
	public Equipement updateEquipement() {        // Pourquoi pas possible d'avoir une liste ? 
		return (Equipement) boutiqueService.updateEquipement(null); //Pourquoi null ?
	}
	
	@GetMapping("/boutique/gestion/equipement/delete")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public void deleteByIdEquipement() {        // Pourquoi pas possible d'avoir une liste ? 
		boutiqueService.deleteByIdEquipement(null); //Pourquoi null ?
	}
}
