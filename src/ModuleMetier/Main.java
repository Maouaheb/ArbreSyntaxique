package ModuleMetier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number dix = new Number(10);
		Number neuf = new Number(9);
		Number cinq = new Number(5);
		Plus plus1 = new Plus(dix, neuf);
		Plus plus2 = new Plus(plus1, cinq);
		// au début, defaut de cache obligatoire
		System.out.println("premier appel");
		System.out.println(plus2.eval());
		// on a un cache valide, donc on le consulte au lieu de parcourir l'arbre
		System.out.println("deuxième appel");
		System.out.println(plus2.eval());
		// on va altérer la valeur du nœud 5
		// qui va conduire à invalider son cache ainsi que celui de operation2
		cinq.setValue(1);

		System.out.println(plus2.eval());

	}

}
