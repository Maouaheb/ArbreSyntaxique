package ModuleMetier;

public class Plus extends Expression {
	private Expression leftexpression;
	private Expression rightexpression;

	public Plus(Expression left, Expression right) {
		this.leftexpression = left;
		this.rightexpression = right;
	}

	public void setLeft(Expression exp) {
		this.leftexpression = exp;
	}

	public void setRight(Expression exp) {
		this.rightexpression = exp;
	}

	public Expression left() {
		return leftexpression;
	}

	public Expression right() {
		return rightexpression;
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		System.out.println("evaluation d'un noeud" + leftexpression.toString() + " " + rightexpression.toString());
		return leftexpression.eval() + rightexpression.eval();
	}

}
