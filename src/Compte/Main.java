package Compte;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteBancaire compte1 = new CompteBancaire("BE123456789");
		compte1.setSolde(870);
		compte1.add(78);
		System.out.println(compte1.getSolde());
		compte1.virement(20);
		System.out.println(compte1.getSolde());

	}

}
