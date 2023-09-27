
public class Dier {
	
	public String naam;
	
	public int leeftijd;
	
	public String kleur;
	
	public boolean levend;
	
	public boolean man;
	
	
	public Dier() {
		System.out.println("In constructor Dier");
	}
	
	public Dier(String naam, int leeftijd, String kleur, 
			boolean levend, boolean man) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.kleur = kleur;
		this.levend = levend;
		this.man = man;
	}
	

	public void printDetails() {
		System.out.println("Naam = " + naam);
		System.out.println("Leeftijd = " + leeftijd);
		System.out.println("Kleur = " + kleur);
		System.out.println("Levend = " + levend);
		System.out.println("Man = " + man);
		System.out.println("");
	}
	
	public void setNaam(String newNaam) {
		naam = newNaam;
	}
	
	public void setLeefijd(int newLeeftijd) {
		leeftijd = newLeeftijd;
	}
	
	public void setKleur(String newKleur) {
		kleur = newKleur;
	}
	
	public void setLevend(boolean newLevend) {
		levend = newLevend;
	}
	
	public void setMan(boolean newMan) {
		man = newMan;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public int getLeeftijd() {
		return leeftijd;
	}
	
	public String getKleur() {
		return kleur;
	}
	
	public boolean getLevend() {
		return levend;
	}
	
	public boolean getMan() {
		return man;
	}
	
}
