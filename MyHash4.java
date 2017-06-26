package interview;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MyHash4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        HashSet<String> Abhishcolor=new HashSet<String>();
        Abhishcolor.add("blue");
        Abhishcolor.add("red");
        
        HashSet<String> Bobbycolor=new HashSet<String>();
        Bobbycolor.add("black");
        Bobbycolor.add("white");
        
        HashSet<String> Catherinecolor=new HashSet<String>();
        Catherinecolor.add("pink");
        Catherinecolor.add("yellow");
        
        HashMap<String,HashSet<String>> map=new HashMap<String,HashSet<String>>();
        
        map.put("Abhish", Abhishcolor);
        map.put("Bobby", Bobbycolor);
        map.put("Catherine", Catherinecolor);
        
        System.out.println(map);
        
        Set s=map.entrySet();
        Iterator i=s.iterator();
        
        while(i.hasNext()){
        	Map.Entry<String, HashSet<String>> e=(Map.Entry<String, HashSet<String>>)i.next();
        	if(e.getValue().equals(Catherinecolor)){
        		HashSet<String> newCatherineColor=new HashSet<>();
        		newCatherineColor.add("purple");
        		newCatherineColor.add("green");
        		e.setValue(newCatherineColor);
        	}
        }
        System.out.println(map);
        System.out.println("");
        Set sk=map.keySet();
        Iterator j=sk.iterator();
        
        while(j.hasNext()){
        	System.out.println("key->"+j.next());
        }
        System.out.println("");
        Collection c=map.values();
        Iterator k=c.iterator();
        while(k.hasNext()){
        	System.out.println("value->"+k.next());
        }
	}

}
