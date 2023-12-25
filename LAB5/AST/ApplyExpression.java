package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ApplyExpression extends Expression{
	public ArrayList<VariableExpression> NameList;
	public Expression expression;
	
	public ApplyExpression(ArrayList<VariableExpression> nl, Expression e)
	{
		NameList = nl;
		expression = e;
	}
	
	public void translate(BufferedWriter out) throws IOException {
		VariableExpression ID;
		
		for(int i = 0 ; i < NameList.size(); i++) {
			ID = (VariableExpression) NameList.get(i);
			
			if(ID != null) {
				ID.translate(out);
				expression.translate(out);
			}
		}
		
	}

}
