package interview;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MyHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           HashMap<Integer,String> map=new HashMap<>();
           map.put(1, "hari");
           map.put(2, "pari");
           map.put(3, "larry");
           
           Set s=map.entrySet();
           Iterator i=s.iterator();
           
           while(i.hasNext()){
        	   System.out.println("key->"+i.next());
           }
           Iterator j=s.iterator();
           
           while(j.hasNext()){
        	   Map.Entry<Integer, String> e=(Map.Entry<Integer, String>)j.next();
        	   System.out.println(e.getKey());
           }
	}

}
