package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrier = new CalendrierAnnuel();
	private int identifiant;
	

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public <F extends Formulaire> boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public <F extends Formulaire> boolean compatible(F formulaire) {
		if (formulaire.getIdentificationEntite() == identifiant && estLibre(formulaire)) {
			return true;
		}
		return false;
	}
	
	public abstract <R extends Reservation, F extends Formulaire> R reserver(F formulaire);


}
