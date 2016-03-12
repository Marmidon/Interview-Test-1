import java.util.Enumeration;
import java.util.Hashtable;
public class Test2 {

	public static void main(String[] args) {
		Hashtable table1 = new Hashtable();
		table1.put("Item1", 20);
		table1.put("Item2", 200);
		table1.put("Item3", 5);
		String result=algorithm(100,table1);
		System.out.println(result);
	}
   public static String algorithm (int total_price, Hashtable<String,Integer> item_price) {
	   String result = "";
	   String str;
	   Enumeration table;
	   int price=0;
	   table = item_price.keys();
	   // Go through each object once, determine if each object in table can be bought and remove if not
	   while(table.hasMoreElements()) {
		   str = (String) table.nextElement();
		   price = item_price.get(str);
		   if (total_price>price) {
			   result=result+" "+str;
		   }
		   else {
			   item_price.remove(str);
		   }
	      }
	   // Going through combinations
	   return result;
   }
   
}
