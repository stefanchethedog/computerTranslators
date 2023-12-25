package AST;

import SymbolTable.Variable;

import java.io.BufferedWriter;
import java.io.IOException;


public class Assignment extends Statement{
	private Variable left;
	private Expression right;
	
	public Assignment(Variable var, Expression i) {
		left = var;
		right = i;
	}
	
	public void translate(BufferedWriter out) throws IOException{
		right.translate(out);
		right.genLoad("R1", out);
		out.write("\tStore\t\tR1, " + left.name);
		out.newLine();
	}
}
