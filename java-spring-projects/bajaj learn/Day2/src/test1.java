import java.util.ArrayList;
import java.util.Iterator;

public class test1 {
	public static void main(String[] args) 
	{
		Complex dobj = new Complex();	
		Complex pobj = new Complex(1,2);
//		System.out.println(dobj);
//		System.out.println(pobj);
		pobj.setImag(12);
		pobj.setReal(11);
//		System.out.println(pobj);
//		System.out.println(pobj.getReal());
		
		ArrayList<Complex> al= new ArrayList<>();
		al.add(dobj);
		al.add(pobj);
		al.add(new Complex(9,10));
		al.add(new Complex(20,40));
		System.out.println("printing usingn list");
		al.size();
//		for (Complex temp : al) {
//			al.add(new Complex(7,7));
//			System.out.println(temp);
//		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr);

//			itr = (Iterator) itr.next();
		}
		
	}
}
