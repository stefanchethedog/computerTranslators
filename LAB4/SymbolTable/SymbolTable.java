package SymbolTable;

public class SymbolTable {
	
	/*tabela simbola za "language scope"
	u ovom slucaju tu pripadaju samo tipovi*/
	private SymbolNode types;
	
	/* tabela simbola za oblast vazenja programa */
	private SymbolNode variables;
	
	public SymbolTable( )
	{
		 types = new Type("unknown", Type.UNKNOWN,null);
		 types = new Type( "integer", Type.INTEGER,types);
		 types = new Type( "float", Type.FLOAT, types );
		 types = new Type( "boolean", Type.BOOLEAN, types);
		 variables = null;
	 }
	
	public boolean addVar( String name, Type type )
	{
		Variable existing = this.getVar( name );
		
		if ( existing != null )
			return false;		//promenjiva je vec deklarisana
		variables = new Variable( name, type, variables );
		
		return true;
	}
	
	public Variable getVar( String name )
	{
		SymbolNode current = variables;
		while ( current != null && current.name.compareTo( name ) != 0 )	//klasicno trazenje po lancanoj listi
			current = current.next;
		
		return ( Variable ) current;
	}
	
	public Type getType(String typeName)
	{
		SymbolNode current = types;
		
		while ( current != null && current.name.compareTo( typeName ) !=0)
			current = current.next;
		
		return ( Type ) current;
	}
	public SymbolNode getVariables()
	{
		return variables;
	}
}