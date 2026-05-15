import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Project> al = new ArrayList<>();
		
		al.add(new Project("demo","zemo2",Arrays.asList("amey","amma","baba"),LocalDate.parse("2009-12-12")));
		al.add(new Project("demo","demo3",Arrays.asList("amey","amma","baba"),LocalDate.parse("2009-12-12")));
		al.add(new Project("demo","demo4",Arrays.asList("amey","amma","baba"),LocalDate.parse("2009-12-12")));
		for (Project p : al)
		{
			System.out.println(p);
		}
		
		
		Iterator<Project> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(al,(a,b)-> a.getProjectName().compareTo(b.getProjectName()));
		System.out.println(al);
		
		
		Vector<String> v = new Vector<>();
		
		
		v.add("umesh");
		v.add("mahesh");
		v.add("suresh");
		
		
		Enumeration e = v.elements();
		
		
		while(e.hasMoreElements())  {
			System.out.println(e.nextElement());
		}
	}
}
