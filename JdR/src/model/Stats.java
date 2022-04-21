package model;

public class Stats {

	/*private Caracteristiques caracteristiques; 
	private Competences competences; 

	private int force = caracteristiques.Force.getRatio(); 
	private int dexterite = caracteristiques.Dexterite.getRatio();
	private int charisme = caracteristiques.Charisme.getRatio();
	private int sagesse = caracteristiques.Sagesse.getRatio();
	private int intelligence = caracteristiques.Intelligence.getRatio();
	private int constitution = caracteristiques.Constitution.getRatio();

	private Caracteristiques Force = caracteristiques.Force;
	private Caracteristiques Dexterite = caracteristiques.Dexterite;
	private Caracteristiques Charisme = caracteristiques.Charisme;
	private Caracteristiques Sagesse = caracteristiques.Sagesse;
	private Caracteristiques Intelligence = caracteristiques.Intelligence;
	private Caracteristiques Constitution = caracteristiques.Constitution;
*/
	
	
	
	private Caracteristiques caracteristique;
	private int valeur;
	
	
	

	public Stats(Caracteristiques caracteristique, int valeur) {
		this.caracteristique = caracteristique;
		this.valeur = valeur;
	}

	public Caracteristiques getCaracteristique() {
		return caracteristique;
	}

	public void setCaracteristique(Caracteristiques caracteristique) {
		this.caracteristique = caracteristique;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
	/// METHODES /// 
/*
	int points = 27;

	public void setCarac(Caracteristiques caracteristiques)
	{
		System.out.println("Vous avez 27 points à répartir entre vos valeurs de caractéristiques ...");

		while(points > 0){

			while (caracteristiques == Force){


				if (force == 15) {
					points = points - 9;
				} else if (force == 14) {
					points = points - 7;
				}  else if (force == 13) {
					points = points - 5;
				}  else if (force == 12) {
					points = points - 4;
				}  else if (force == 11) {
					points = points - 3;
				} else if (force == 10) {
					points = points - 2;
				}  else if (force == 9) {
					points = points - 1;
				}  else if (force == 8) {
					points = points - 0;
				}

			}

			while (caracteristiques == Dexterite){


				if ( dexterite == 15) {
					points = points - 9;
				} else if (dexterite == 14) {
					points = points - 7;
				}  else if (dexterite == 13) {
					points = points - 5;
				}  else if (dexterite == 12) {
					points = points - 4;
				}  else if (dexterite == 11) {
					points = points - 3;
				} else if (dexterite == 10) {
					points = points - 2;
				}  else if (dexterite == 9) {
					points = points - 1;
				}  else if (dexterite == 8) {
					points = points - 0;
				}

			}

			while (caracteristiques == Charisme){

				if (charisme == 15) {
					points = points - 9;
				} else if (charisme == 14) {
					points = points - 7;
				}  else if (charisme == 13) {
					points = points - 5;
				}  else if (charisme == 12) {
					points = points - 4;
				}  else if (charisme == 11) {
					points = points - 3;
				} else if (charisme == 10) {
					points = points - 2;
				}  else if (charisme == 9) {
					points = points - 1;
				}  else if (charisme == 8) {
					points = points - 0;
				}

			}


			while (caracteristiques == Sagesse){


				if ( sagesse == 15) {
					points = points - 9;
				} else if (sagesse == 14) {
					points = points - 7;
				}  else if (sagesse == 13) {
					points = points - 5;
				}  else if (sagesse == 12) {
					points = points - 4;
				}  else if (sagesse == 11) {
					points = points - 3;
				} else if (sagesse == 10) {
					points = points - 2;
				}  else if (sagesse == 9) {
					points = points - 1;
				}  else if (sagesse == 8) {
					points = points - 0;
				} 
			}

			while (caracteristiques == Intelligence){


				if ( intelligence == 15) {
					points = points - 9;
				} else if (intelligence == 14) {
					points = points - 7;
				}  else if (intelligence == 13) {
					points = points - 5;
				}  else if (intelligence == 12) {
					points = points - 4;
				}  else if (intelligence == 11) {
					points = points - 3;
				} else if (intelligence == 10) {
					points = points - 2;
				}  else if (intelligence == 9) {
					points = points - 1;
				}  else if (intelligence == 8) {
					points = points - 0;
				}

			}

			while (caracteristiques == Constitution){


				if (constitution == 15) {
					points = points - 9;
				} else if (constitution == 14) {
					points = points - 7;
				}  else if (constitution == 13) {
					points = points - 5;
				}  else if (constitution == 12) {
					points = points - 4;
				}  else if (constitution == 11) {
					points = points - 3;
				} else if (constitution == 10) {
					points = points - 2;
				}  else if (constitution == 9) {
					points = points - 1;
				}  else if (constitution == 8) {
					points = points - 0;
				}

			}
		}
	}





	public void updateCompetence (Competences competences)
	{

		if (competences.getModificateur() == "Force") 
		{
			force = force + 2;
		}

		else if (competences.getModificateur() == "Dexterite") 
		{
			dexterite = dexterite + 2;
		}

		else if (competences.getModificateur() == "Charisme") 
		{
			charisme = charisme + 2;
		}

		else if (competences.getModificateur() == "Sagesse") 
		{
			sagesse = sagesse + 2;
		}

		else if (competences.getModificateur() == "Intelligence") 
		{
			intelligence = intelligence + 2;
		}

		else if (competences.getModificateur() == "Constitution") 
		{
			constitution = constitution + 2;
		}


	}
*/




	/////////////// GET / SET //////////////////////////////////


	


}
