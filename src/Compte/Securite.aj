package Compte;

public aspect Securite {
pointcut security(float somme) : call(void CompteBancaire.virement(float)) && args(somme);
before(float somme) : security(somme) {
	
	System.out.println("Security check before operation  "+somme);
}
}
