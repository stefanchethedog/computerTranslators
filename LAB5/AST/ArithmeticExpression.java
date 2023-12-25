package AST;

import java.io.*;

public abstract class ArithmeticExpression extends Expression{
	private Expression left;
	private Expression right;
	
	public ArithmeticExpression(Expression i1, Expression i2)
	{
		left = i1;
		right = i2;
	}
	
	protected abstract String opCode();
	
	public void translate(BufferedWriter out) throws IOException
	{
		left.translate(out);
		right.translate(out);
		left.genLoad("R1", out);
		right.genLoad("R2", out);
		
		out.write("\t" + opCode() + "\t\tR1, R2");
		out.newLine();
		
		this.result = ASTNode.genVar();
		out.write("\tStore\t\tR1, " + this.result);
		out.newLine();
	}
}
