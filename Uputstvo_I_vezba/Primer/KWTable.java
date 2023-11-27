
import java.util.Hashtable;
public class KWTable {

	private Hashtable mTable;
	public KWTable()
	{
		// Inicijalizcaija hash tabele koja pamti kljucne reci
		mTable = new Hashtable();
		mTable.put("main", new Integer(sym.MAIN));
		mTable.put("program", new Integer(sym.PROGRAM));
		mTable.put("exit", new Integer(sym.EXIT));
		mTable.put("int", new Integer(sym.INT));
		mTable.put("float", new Integer(sym.FLOAT));
		mTable.put("bool", new Integer(sym.BOOL));
		mTable.put("for", new Integer(sym.FOR));
		mTable.put("in", new Integer(sym.IN));
		mTable.put("apply", new Integer(sym.APPLY));
	}
	
	/**
	 * Vraca ID kljucne reci 
	 */
	public int find(String keyword)
	{
		Object symbol = mTable.get(keyword);
		if (symbol != null)
			return ((Integer)symbol).intValue();
		
		// Ako rec nije pronadjena u tabeli kljucnih reci radi se o identifikatoru
		return sym.ID;
	}
	

}
