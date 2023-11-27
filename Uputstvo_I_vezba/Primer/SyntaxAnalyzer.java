import java.io.IOException;
import java.util.*;

public class SyntaxAnalyzer {
	HashMap<String, Integer> rows = new HashMap<>();
	HashMap<String, Integer> columns = new HashMap<>();
	
	String[][] syntaxTable = new String[16][10];
	String[] smene = new String[9];
	
	public SyntaxAnalyzer()
	{
		rows.put("AE", 0);
		rows.put("NL", 1);
		rows.put("NL'", 2);
		rows.put("E", 3);
		rows.put("E'", 4);
		rows.put("T", 5);
		rows.put("for", 6);
		rows.put("in", 7);
		rows.put("[", 8);
		rows.put("]", 9);
		rows.put("apply", 10);
		rows.put("ID", 11);
		rows.put("CONST", 12);
		rows.put("+", 13);
		rows.put(",", 14);
		rows.put("#", 15);
		
		columns.put("for", 0);
		columns.put("in", 1);
		columns.put("[", 2);
		columns.put("]", 3);
		columns.put("apply", 4);
		columns.put("ID", 5);
		columns.put("CONST", 6);
		columns.put("+", 7);
		columns.put(",", 8);
		columns.put("#", 9);
		
		smene[0] = "for ID in [ NL ] apply E";
		smene[1] = "ID NL'";
		smene[2] = ", ID NL'";
		smene[3] = ""; //epsilon smena
		smene[4] = "T E'";
		smene[5] = "+ T E'";
		smene[6] = "";
		smene[7] = "ID";
		smene[8] = "CONST";
		
		for(int i = 0 ; i < 16; i++) {
			for(int j = 0 ; j < 10; j++) {
				syntaxTable[i][j] = "err";
			}
		}
		for(int i = 6; i < 15; i++) {
			for(int j = 0; j < 9; j++) {
				syntaxTable[i][j] = "pop";
			}
		}
		syntaxTable[15][9] = "acc";
		
		syntaxTable[0][0] = "0";
		syntaxTable[1][5] = "1";
		syntaxTable[2][8] = "2";
		syntaxTable[2][3] = "3";
		syntaxTable[3][5] = "4";
		syntaxTable[3][6] = "4";
		syntaxTable[4][7] = "5";
		syntaxTable[4][9] = "6";
		syntaxTable[5][5] = "7";
		syntaxTable[5][6] = "8";
		
	}
	
	public String M(String top, Yytoken next)
	{
		String[] ss = top.split(" ");
		if(next.m_index == sym.ID) //ID
		{
			if(ss[0].equals("ID"))
			{
				return "pop";
			}
			return syntaxTable[rows.get(top)][columns.get("ID")];
		}
		if(next.m_index == sym.CONST) //CONST
		{
			if(ss[0].equals("CONST"))
				return "pop";
			else
				return syntaxTable[rows.get(top)][columns.get("CONST")];
		}
		if(ss[0].equals("#") && next.m_text.equals("#"))
		{
			return "acc";
		}
		if(ss[0].equals(next.m_text))
		{
			return "pop";
		}
		if(columns.containsKey(next.m_text))
		return syntaxTable[rows.get(top)][columns.get(next.m_text)];
		
		return "err";
	}
	
	public boolean SA_LL1(MPLexer lexer)
	{
		Stack<String> stek = new Stack<>();
		stek.push("#");
		stek.push("AE");
		boolean prepoznat = false;
		boolean greska = false;
		String s;
		String[] niz;
		try {
			 Yytoken next = lexer.next_token();
			do
			{
				s = M(stek.peek(), next);
				switch(s)
				{
				case "pop":
					stek.pop();
					next = lexer.next_token();
					break;
				case "acc":
					prepoznat = true;
					break;
				case "err":
					greska = true;
					break;
				default:
					stek.pop();
					niz = smene[Integer.parseInt(s)].split(" ");
					String[] b = new String[niz.length];
			        int j = niz.length;
			        for (int i = 0; i < niz.length; i++) {
			            b[j - 1] = niz[i];
			            j = j - 1;
			        }
					for(String str : b)
					{
						if(!str.equals(""))
						stek.push(str);
					}
					break;
				}
				
				
				
			}while(!(prepoznat || greska));
			
			return prepoznat;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prepoznat;
		
	}
}
