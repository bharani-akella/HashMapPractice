package interview;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MyHash5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             HashMap<Object, Object> map=new HashMap<Object, Object>();
             map.put(1, "one");
             map.put(2, "two");
             map.put(3, "three");
             map.put(4, "four");
             
             Set myKeys=map.keySet();
             Iterator i=myKeys.iterator();
             while(i.hasNext()){
            	 int key=(int)i.next();
            	 String value=(String)map.get(key);
            	 System.out.println("key->"+key+" value->"+value);
             }
	}

}
