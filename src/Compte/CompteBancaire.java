package Compte;

public class CompteBancaire {
	private String rib;
	private float solde;

	public CompteBancaire(String rib) {
		solde = 0;
		this.rib = rib;
	}

	public void virement(float somme) {
		if (somme < solde) {
			System.out.println("virement est fait");
			solde = solde - somme;
		}
	}

	public void add(float somme) {
		solde = solde + somme;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

}
