package AST;

import java.io.*;

import SymbolTable.Variable;

public class VariableExpression 
extends TermExpression {
	private Variable targetVar;
	
	public VariableExpression( Variable var )
	{
		targetVar = var;
	}
	
	public void translate( BufferedWriter out )
	throws IOException
	{
		this.result = targetVar.name;
	}
}
