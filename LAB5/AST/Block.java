package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Block extends Statement{
	private ArrayList statements = new ArrayList();
	
	public void addStatement(Statement dec) {
		statements.add(dec);
	}
	
	public void translate(BufferedWriter out) throws IOException
	{
		for(int i = 0 ; i < statements.size(); i++) {
			Statement current = (Statement) statements.get(i);
			
			current.translate(out);
		}
	}
}
