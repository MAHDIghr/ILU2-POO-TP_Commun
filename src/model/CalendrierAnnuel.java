package model;

import java.util.Iterator;

public class CalendrierAnnuel {
	private Mois[] mois = new Mois[12];

	public CalendrierAnnuel() {
		mois[0] = new Mois("Janvier", 31);
		mois[1] = new Mois("Février", 28);
		mois[2] = new Mois("Mars", 31);
		mois[3] = new Mois("Avril", 30);
		mois[4] = new Mois("Mai", 31);
		mois[5] = new Mois("Juin", 30);
		mois[6] = new Mois("Juillet", 31);
		mois[7] = new Mois("Août", 31);
		mois[8] = new Mois("Septembre", 30);
		mois[9] = new Mois("Octobre", 31);
		mois[10] = new Mois("Novembre", 30);
		mois[11] = new Mois("Décembre", 31);
	}

	private class Mois {
		private String nom;
		private boolean[] jours;

		private Mois(String nom, int nbJoursDuMois) {
			this.nom = nom;
			jours = new boolean[nbJoursDuMois];
			for (int i = 0; i < jours.length; i++) {
				jours[i] = false;
			}
		}

		private boolean estLibre(int jour) {
			return jours[jour-1] == false;
		}

		private void reserver(int jour) {
			jours[jour-1] = true;
		}
	}

	public boolean estLibre(int jour, int mois) {
		if (this.mois[mois-1].estLibre(jour)) {

			return true;
		}
		return false;
	}

	public boolean reserver(int jour, int mois) {
		if (!estLibre(jour, mois)) {
			return false;
		} else {
			this.mois[mois-1].reserver(jour);
			return true;
		}
	}

}
