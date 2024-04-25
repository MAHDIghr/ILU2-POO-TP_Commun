package model;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	protected int numEtiteReserve;

	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois; 
		numEtiteReserve = 0;
	}

	public int getIdentificationEntite() {
		return numEtiteReserve;
	}

	public void setIdentificationEntite(int numEntiteReserve) {
		this.numEtiteReserve = numEntiteReserve;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

}
