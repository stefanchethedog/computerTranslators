package AST;

import java.io.*;

import SymbolTable.Constant;

public class ConstantExpression 
extends TermExpression{
	private Constant targetConst;
	
	public ConstantExpression( Constant c )
	{
		targetConst = c;
	}
	
	public void translate( BufferedWriter out )
	throws IOException
	{
		this.result = targetConst.value.toString();
	}
	
	protected void genLoad( String reg, BufferedWriter out )
	throws IOException
	{
		out.write( "\tLoad_Const\t" + 
				reg + ", " + result );
		out.newLine();
	}
}
