package AST;

public class Sum extends ArithmeticExpression{
	public Sum(Expression i1, Expression i2)
	{
		super(i1, i2);
	}
	
	protected String opCode()
	{
		return "Add";
	}
}
