package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HAshTableDemo {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1,"name");//entry
		map.put(10, "name");
		map.put(2,"name2");
		map.put(23.3, 23);
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey()+" value = "+entry.getValue());
		}
	}
}
