package interview;
import java.util.*;
public class MyHash6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  HashMap<Object, Object> map=new HashMap<Object, Object>();
                  map.put("Ashwin", 67);
                  map.put("Bhuvi", 34);
                  map.put("Chandu", 90);
                  map.put("Dhawan", 82);
                  
                  Collection c=map.values();
                  Iterator i=c.iterator();
                  Set key=map.keySet();
                  Iterator j=key.iterator();
                  for(Object o : c){
                	  System.out.print(j.next()+" ");
                	  System.out.println(i.next());
                  }
                  
	}

}
