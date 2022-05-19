package theHeroesFoundryFRONT.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/admin")
//@CrossOrigin(origins = "*")


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


	@DeleteMapping("/{id}")
	@JsonView(JsonViews.Common.class) 
	public void DeleteJoueurById(@PathVariable Long id) {
		compteService.deleteByIdJoueur(id);
	}
	
	
	//PERSONNAGES DU JOUEUR
	
	@GetMapping("/{id}/personnages")
	@JsonView(JsonViews.JoueurWithPersonnages.class) 
	public Joueur getJoueurByIdWithPersonnages(@PathVariable Long id) {
		return compteService.getByIdWithPersonnages(id);
	}

	@DeleteMapping("/{id}/personnages")
	@JsonView(JsonViews.JoueurWithPersonnages.class)
	public void DeletePersonnageById(@PathVariable Long id) {
		personnageService.deleteById(id); 
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
	public List<Consommables> getAllConsommables() {        
		return boutiqueService.getAllConsommables();
	}

	@PostMapping("/boutique/gestion/consommables")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public Consommables createConsommables(@RequestBody Consommables consommables) {        
		return (Consommables) boutiqueService.createConsommables(consommables); 
	}
	
	@PutMapping("/boutique/gestion/consommables")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public Consommables updateConsommables(@RequestBody Consommables consommables) {        
		return (Consommables) boutiqueService.updateConsommables(consommables);
	}
	
	@DeleteMapping("/boutique/gestion/consommables/{id}")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public void deleteByIdConsommables(@PathVariable Long id) {       
		boutiqueService.deleteByIdConsommables(id); 
	}
	
	
	//EQUIPEMENT
	
	@GetMapping("/boutique/gestion/equipement")
	@JsonView(JsonViews.EquipementFromBoutique.class) 
	public List<Equipement> getAllEquipement() {    
		return boutiqueService.getAllEquipement();
	}
	
	@PostMapping("/boutique/gestion/equipement")
	@JsonView(JsonViews.EquipementFromBoutique.class) 
	public Equipement createEquipement(@RequestBody Equipement equipement) {       
		return (Equipement) boutiqueService.createEquipement(equipement);
	}
	
	@PutMapping("/boutique/gestion/equipement/update")
	@JsonView(JsonViews.EquipementFromBoutique.class) 
	public Equipement updateEquipement(@RequestBody Equipement equipement) {         
		return (Equipement) boutiqueService.updateEquipement(equipement); 
	}
	
	@DeleteMapping("/boutique/gestion/equipement/{id}")
	@JsonView(JsonViews.ConsommablesFromBoutique.class) 
	public void deleteByIdEquipement(@PathVariable Long id) {         
		boutiqueService.deleteByIdEquipement(id);
	}
}
