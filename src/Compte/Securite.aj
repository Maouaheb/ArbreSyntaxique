package Compte;

public aspect Security {
	pointcut add(float s) : call(float CompteBancaire.add(float))&&args(s);
float around(float s) : add(s) {
	
	proceed(s);
	System.out.println("around is here");
	return s;
}
}
