package ModuleMetier;

public class Number extends Expression {
	private int value;

	public Number(int value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		System.out.println("evaluation d'un noeud " + value);
		return value;
	}

}
