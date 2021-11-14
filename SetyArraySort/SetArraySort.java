package dailyassignments.SetyArraySort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetArraySort {

	public static void main(String[] args) {
		Set<Integer> set =new HashSet<Integer>();
		set.add(100);
		set.add(70);
		set.add(80);
		set.add(34);
		set.add(11);
		ArrayList arr1=new ArrayList(set);
		Collections.sort(arr1);
	arr1.forEach(itr->System.out.print(itr+" "));
	}
	

	}


