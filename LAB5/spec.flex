// import sekcija
import java_cup.runtime.*;

%%
// sekcija opcija i deklaracija
%class MPLexer

%cup

%line	
%column

%debug

%eofval{
	return new Symbol( sym.EOF );
%eofval}

%{
	public int getLine()
	{
		return yyline;
	}

%}

//stanja
%xstate KOMENTAR

//makroi
slovo = [a-zA-Z]
cifra = [0-9]
cifre = [1-9]{cifra}*
osnova = 0 | 0x

int = {osnova}?{cifre}
float = {cifra}.{cifre}(E[+-]{cifre})?
bool = (true)|(false)
%%

// pravila
\/\/ { yybegin( KOMENTAR ); }
<KOMENTAR>~[(\t)(\n)(\r)] { yybegin( YYINITIAL ); }

[\t\n\r ] { ; }

//operatori
\+ { return new Symbol( sym.PLUS  ); }
\- { return new Symbol( sym.MINUS  ); }
//separatori
; { return new Symbol( sym.SEMICOLON ); }
, { return new Symbol( sym.COMMA ); }
:= { return new Symbol( sym.ASSIGN ); }

\[ { return new Symbol( sym.OPEN_SQUARE_BRACKET );}
\] { return new Symbol( sym.CLOSED_SQUARE_BRACKET );}

//kljucne reci
"main"			{ return new Symbol( sym.MAIN );	}
"exit"			{ return new Symbol( sym.EXIT );	}
"int"		{ return new Symbol( sym.INT );	}
"float" { return new Symbol( sym.FLOAT); }
"bool"			{ return new Symbol( sym.BOOL );	}
"for"			{ return new Symbol( sym.FOR );	}
"in"			{ return new Symbol( sym.IN );	}
"apply"			{ return new Symbol( sym.APPLY );	}

{bool} { return new Symbol(sym.BOOLEANCONST, new Boolean(yytext()) ); }

//identifikator
{slovo}({slovo}|{cifra})* { return new Symbol( sym.ID, yyline, yytext() ); }

//konstante
{int} { return new Symbol( sym.INTCONST, new Integer(yytext()) ); }
{float} { return new Symbol(sym.FLOATCONST, new Float(yytext()) ); }

//obrada gresaka
.		{ System.out.println( "ERROR: " + yytext() ); }
