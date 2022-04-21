package model;

public enum Caracteristiques {
	
	Force(10), Dexterite(10), Charisme(10), Sagesse(10), Intelligence(10), Constitution(10);


private int ratio;

private Caracteristiques(int ratio)
{
	this.ratio = ratio; 
}

public int getRatio() {
	return ratio;
}

public void setRatio(int ratio) {
	this.ratio = ratio;
}

}