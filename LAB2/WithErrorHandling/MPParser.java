
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sun Dec 03 15:37:05 CET 2023
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Sun Dec 03 15:37:05 CET 2023
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\003\005\000\002\002\004\000\002\004" +
    "\004\000\002\005\004\000\002\005\003\000\002\006\005" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\010\005\000\002\010\003\000\002\011\003\000\002" +
    "\011\003\000\002\012\005\000\002\013\005\000\002\013" +
    "\005\000\002\013\003\000\002\014\003\000\002\014\003" +
    "\000\002\015\012\000\002\015\012\000\002\015\011\000" +
    "\002\015\010\000\002\015\007\000\002\015\006\000\002" +
    "\015\004\000\002\016\005\000\002\016\003\000\002\016" +
    "\005\000\002\016\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\004\004\005\001\002\000\004\002\063\001" +
    "\002\000\010\006\014\007\013\010\012\001\002\000\014" +
    "\006\ufffd\007\ufffd\010\ufffd\011\ufffd\014\ufffd\001\002\000" +
    "\004\014\061\001\002\000\004\005\060\001\002\000\014" +
    "\006\014\007\013\010\012\011\016\014\021\001\002\000" +
    "\004\014\ufff9\001\002\000\004\014\ufffa\001\002\000\004" +
    "\014\ufffb\001\002\000\006\005\ufff6\021\ufff6\001\002\000" +
    "\006\003\040\014\037\001\002\000\014\006\ufffe\007\ufffe" +
    "\010\ufffe\011\ufffe\014\ufffe\001\002\000\006\005\ufff7\021" +
    "\ufff7\001\002\000\004\020\026\001\002\000\006\005\uffff" +
    "\021\024\001\002\000\006\005\ufff5\021\ufff5\001\002\000" +
    "\006\011\016\014\021\001\002\000\006\005\ufff8\021\ufff8" +
    "\001\002\000\006\014\030\015\027\001\002\000\012\005" +
    "\ufff0\016\ufff0\017\ufff0\021\ufff0\001\002\000\012\005\uffef" +
    "\016\uffef\017\uffef\021\uffef\001\002\000\012\005\ufff1\016" +
    "\ufff1\017\ufff1\021\ufff1\001\002\000\012\005\ufff4\016\033" +
    "\017\034\021\ufff4\001\002\000\006\014\030\015\027\001" +
    "\002\000\006\014\030\015\027\001\002\000\012\005\ufff2" +
    "\016\ufff2\017\ufff2\021\ufff2\001\002\000\012\005\ufff3\016" +
    "\ufff3\017\ufff3\021\ufff3\001\002\000\004\012\041\001\002" +
    "\000\006\005\uffe8\021\uffe8\001\002\000\006\003\042\023" +
    "\043\001\002\000\006\005\uffe9\021\uffe9\001\002\000\006" +
    "\003\045\014\044\001\002\000\010\003\uffe6\022\uffe6\024" +
    "\uffe6\001\002\000\006\005\uffea\021\uffea\001\002\000\010" +
    "\003\050\022\047\024\051\001\002\000\006\003\057\014" +
    "\056\001\002\000\014\003\uffe4\005\uffeb\021\uffeb\022\uffe4" +
    "\024\uffe4\001\002\000\006\003\053\013\052\001\002\000" +
    "\010\003\054\011\016\014\021\001\002\000\006\005\uffec" +
    "\021\uffec\001\002\000\006\005\uffed\021\uffed\001\002\000" +
    "\006\005\uffee\021\uffee\001\002\000\010\003\uffe7\022\uffe7" +
    "\024\uffe7\001\002\000\010\003\uffe5\022\uffe5\024\uffe5\001" +
    "\002\000\004\002\001\001\002\000\004\021\062\001\002" +
    "\000\014\006\ufffc\007\ufffc\010\ufffc\011\ufffc\014\ufffc\001" +
    "\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\004\003\003\001\001\000\002\001\001\000" +
    "\012\004\007\005\010\006\005\007\006\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\006" +
    "\016\007\006\010\021\011\017\012\014\015\022\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\011\024\012\014\015\022\001\001\000\002" +
    "\001\001\000\006\013\031\014\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\014\035\001\001\000\004\014\034\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\016" +
    "\045\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\011\054\012\014\015\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	
	public int errNo = 0;

   public static void main( String[] args )
   {
      try
	  {
		   FileReader file = new FileReader( args[0] );
		   Scanner scanner = new MPLexer( file );
		   MPParser parser = new MPParser( scanner );
		   parser.parse();
		   if(parser.errNo == 0)
		   		System.out.println("Analiza uspesno zavrsena");
		   else
		   		System.out.println("Analiza zavrsena, broj gresaka: " + parser.errNo);
	  }
	  catch( Exception e )
	  {
		   e.printStackTrace();
	  }
   }
   
   
   public void syntax_error(Symbol cur_token)
   {
   }
   
   public void report_error(String message, Object info)
   {
   		System.out.print(message);
   }
   
   public int getLine()
   {
   		return ((MPLexer) getScanner()).getLine();
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // NameList ::= NameList error 
            {
              Object RESULT = null;
		
           		System.out.println( "Nedostaje zarez " + parser.getLine() );
           		parser.errNo++;
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // NameList ::= NameList COMMA error 
            {
              Object RESULT = null;
		
           		System.out.println( "Greska u liniji " + parser.getLine() + "nedostaje identifikator" );
           		parser.errNo++;
           	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // NameList ::= ID 
            {
              Object RESULT = null;
		
           	  System.out.println( "Redukcija 21: NameList ::= ID" );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija 20: NameList ::= NameList, ID" );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ApplyExpression ::= FOR error 
            {
              Object RESULT = null;
		
             System.out.println( "Error: for ID in [ <NameList> ] apply <Expression> " + parser.getLine() );
             parser.errNo++;
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ApplyExpression ::= FOR ID IN error 
            {
              Object RESULT = null;
		
             System.out.println( "Error: Expected [ " + parser.getLine() );
             parser.errNo++;
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ApplyExpression ::= FOR ID IN OPEN_SQUARE_BRACKET error 
            {
              Object RESULT = null;
		
             System.out.println( "Error: Expected NameList in form of: ID, ID, ..." + parser.getLine() );
             parser.errNo++;
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ApplyExpression ::= FOR ID IN OPEN_SQUARE_BRACKET NameList error 
            {
              Object RESULT = null;
		
             System.out.println( "Greska: nedostaje ']'/ Error: ] expected " + parser.getLine() );
             parser.errNo++;
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-5)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ApplyExpression ::= FOR ID IN OPEN_SQUARE_BRACKET NameList CLOSED_SQUARE_BRACKET error 
            {
              Object RESULT = null;
		
             System.out.println( "Greska: nedostaje 'apply'/ Error: apply keyword expected" + parser.getLine() );
             parser.errNo++;
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ApplyExpression ::= FOR ID IN OPEN_SQUARE_BRACKET NameList CLOSED_SQUARE_BRACKET APPLY error 
            {
              Object RESULT = null;
		
             System.out.println( "Greska: nedostaje izraz/ Error: Expression missing after apply" + parser.getLine() );
             parser.errNo++;
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-7)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ApplyExpression ::= FOR ID IN OPEN_SQUARE_BRACKET NameList CLOSED_SQUARE_BRACKET APPLY Expression 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija 19: ApplyExp ::= for ID in [ NameList ] apply Expression" );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-7)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // TermExpression ::= ID 
            {
              Object RESULT = null;
		
         		System.out.println("Redukcija 17: TermExpression ::= ID" );
         	
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*TermExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // TermExpression ::= CONST 
            {
              Object RESULT = null;
		
            	System.out.println( "Redukcija 16: TermExpression ::= CONST" );
         	
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*TermExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ArithmeticExpression ::= TermExpression 
            {
              Object RESULT = null;
		
          		System.out.println("Redukcija 15: ArithmeticExpression ::= TermExpression" );
          	
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ArithmeticExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ArithmeticExpression ::= ArithmeticExpression MINUS TermExpression 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija 14: ArithmeticExpression ::= ArithmeticExpression - TermExpression" );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ArithmeticExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ArithmeticExpression ::= ArithmeticExpression PLUS TermExpression 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija 13: ArithmeticExpression ::= ArithmeticExpression + TermExpression" );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ArithmeticExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Assignment ::= ID ASSIGN ArithmeticExpression 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija 12: Assignment ::= ID:= ArithmeticExpression" );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Assignment*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Expression ::= ApplyExpression 
            {
              Object RESULT = null;
		
       		System.out.println("Redukcija 11: Expression ::= ApplyExpression" );  
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Expression ::= Assignment 
            {
              Object RESULT = null;
		
            System.out.println( "Redukcija 10: Expression ::= Assignment" );
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Expressions ::= Expression 
            {
              Object RESULT = null;
		
           System.out.println( "Redukcija 9: Expressions ::= Expression" );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Expressions*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expressions ::= Expressions SEMICOLON Expression 
            {
              Object RESULT = null;
		
           System.out.println( "Redukcija 8: Expressions ::= Expressions SEMICOLON EXPRESSION" );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Expressions*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= BOOL 
            {
              Object RESULT = null;
		
           	 	System.out.println( "Redukcija 8: Type ::= BOOL");
           	 
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Type ::= FLOAT 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija 7: Type ::= FLOAT" );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Type ::= INT 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija 6: Type ::= INT" );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declaration ::= Type ID SEMICOLON 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija 5: Declaration ::= Type ID;" );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*Declaration*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Declarations ::= Declaration 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija 4: Declarations ::= Declaration" );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Declarations ::= Declarations Declaration 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija 3: Declarations ::= Declarations Declaration" );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= Declarations Expressions 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija 2: Block ::= Declarations Expressions" );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN Block EXIT 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija 1: Program ::= main Block exit" );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

