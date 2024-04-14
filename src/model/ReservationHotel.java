package model;

public class ReservationHotel extends Reservation {

	
	private int nbLitSimple;
	private int numChambre;
	
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int numChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.numChambre = numChambre;
	}


	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + "\nLa chambre num "+ numChambre +" avec "+ nbLitSimple +" lit simple.";
	}

}
