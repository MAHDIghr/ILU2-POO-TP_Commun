package model;

public class FormulaireHotel extends Formulaire {

	private int numLitSimple;
	private int numLitDouble;

	public FormulaireHotel(int jour, int mois, int numLitSimple, int numLitDouble) {
		super(jour, mois);
		this.numLitSimple = numLitSimple;
		this.numLitDouble = numLitDouble;
	}

}
