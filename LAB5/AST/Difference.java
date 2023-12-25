package AST;

public class Difference extends ArithmeticExpression
{
	public Difference(Expression i1, Expression i2)
	{
		super(i1, i2);
	}
	

	protected String opCode()
	{
		return "Sub";
	}
}
