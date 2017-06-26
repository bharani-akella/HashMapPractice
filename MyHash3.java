package interview;
import java.util.HashMap;
import java.util.Map;
public class MyHash3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            HashMap<Object,Object> map=new HashMap<>();
            
            map.put("ONE", true);
            map.put(null, 1);
            map.put(1, 1);
            map.put(true, "sam");
            map.put(7, "orange");
            map.put(8, "apple");
            map.put(9, "grape");
            
            for(Map.Entry<Object, Object> e : map.entrySet()){
            	System.out.print("key->"+e.getKey()+" ");
            	System.out.println("Value->"+e.getValue());
            }
            System.out.println("");
            for(Object o :map.keySet()){
           
            	System.out.print(o+" ");
            }
            
            System.out.println("\n");
            
           for(Object o : map.values()){
        	   System.out.print(o+" ");
           } 
            
	}

}
