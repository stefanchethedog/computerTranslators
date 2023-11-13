// import sekcija

%%

// sekcija opcija i deklaracija
%class MPLexer
%function next_token
%line	
%column
%debug
%type Yytoken

%eofval{
return new Yytoken( sym.EOF, null, yyline, yycolumn);
%eofval}

%{
//dodatni clanovi generisane klase
KWTable kwTable = new KWTable();
Yytoken getKW()
{
	return new Yytoken( kwTable.find( yytext() ),
	yytext(), yyline, yycolumn );
}
%}

//stanja
%xstate KOMENTAR

//makroi
slovo = [a-zA-Z]
cifra = [0-9]
cifre = {cifra}+
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
\+ { return new Yytoken( sym.PLUS,yytext(), yyline, yycolumn ); }
\- { return new Yytoken( sym.MINUS,yytext(), yyline, yycolumn ); }
//separatori
; { return new Yytoken( sym.SEMICOLON, yytext(), yyline, yycolumn ); }
, { return new Yytoken( sym.COMMA, yytext(), yyline, yycolumn ); }
:= { return new Yytoken( sym.ASSIGN, yytext(), yyline, yycolumn ); }

//kljucne reci
{slovo}+ { return getKW(); }

//identifikator
{slovo}({slovo}|{cifra})* { return new Yytoken( sym.ID, yytext(), yyline, yycolumn); }

//konstante
{int}|{float}|{bool} { return new Yytoken( sym.CONST, yytext(), yyline, yycolumn); }

//obrada gresaka
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }
