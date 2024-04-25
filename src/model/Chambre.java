package model;

public class Chambre extends EntiteReservable<FormulaireHotel> {



	@Override
	public Reservation reserver(Formulaire formulaire) {
		return new ReservationHotel(formulaire.getJour(), formulaire.getMois(),formulaire.getNumLitSimple() ,formulaire.getIdentificationEntite();
	}
	}

}
