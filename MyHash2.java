package interview;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MyHash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           HashMap<Integer,String> map=new HashMap<>();
           map.put(1, "hari");
           map.put(2, "pari");
           map.put(3, "larry");
           
           Set s= map.entrySet();
           
           for(Object o :s){
        	   Map.Entry<Integer, String> e=(Map.Entry<Integer, String>)o;
        	   System.out.println(e.getValue());
        	   if(e.getValue().equals("larry")){
        		   e.setValue("Mory");
        	   }
        	   
           }
           
           System.out.println(map);
	}

}
