package model;

public class CentralDeReservation<> {
	private <F, R>[] listeDesEntites;
	private int nbEntites;

	public CentralDeReservation(EntiteReservable<F, R>[] listeDesEntites) {
		this.listeDesEntites = listeDesEntites;
		nbEntites = 0;
	}

	public int ajouterEntite(EntiteReservable<F, R> entite) {
		listeDesEntites[nbEntites + 1] = entite;
		nbEntites++;
		entite.setIdentifiant(entite.getIdentifiant() + 1);
		return entite.getIdentifiant();
	}

	public int[] donnerPossibilites(F formulaire) {
		int[] numDesEntiteDisponibles = new int[nbEntites];

		for (int i = 0; i < numDesEntiteDisponibles.length; i++) {
			if (listeDesEntites[i].compatible(formulaire)) {
				numDesEntiteDisponibles[i] = listeDesEntites[i].getIdentifiant();
			} else {
				numDesEntiteDisponibles[i] = 0;
			}
		}
		return numDesEntiteDisponibles;
	}
	
	public <R extends Reservation>  R reserver(int numEntite, F formulaire) {
		
		for (int i = 0; i < listeDesEntites.length; i++) {
			if (listeDesEntites[i]) {
				
			}
		}

		
	}
}
