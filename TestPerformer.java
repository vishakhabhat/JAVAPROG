import java.util.*;
public class TestPerformer
{
	public static void main(String [] args)
	{
		//Scanner sc = new Scanner(System.in);
		//int n;
		
		ArrayList<String> arl = new ArrayList<String>();
			//addAryList(arl);
		printArryList(arl);
		//n = sc.nextInt();
	    LinkedList<String> lst = new LinkedList<String>();
		printLList(lst);

	}
	

 public static void printArryList(ArrayList<String> arl)
 {
	 long startTime = new Date().getTime();
	 
	for(int i=0;i<50;i++)
	{
		arl.add("hello");
		arl.get(i);
		System.out.println(arl + " " + i);
		}
	
	long endTime = new Date().getTime();
	
	System.out.println("Time taken : " + (endTime-startTime)/1000);
 }
 
 public static void printLList(LinkedList<String> lst)
 {
	  long startTime = new Date().getTime();

	 for(int i=0;i<50;i++)
	 {
		 lst.add("world");
		 lst.get(i);
		 System.out.println(lst + " " + i);
	 }
	 
	 long endTime = new Date().getTime();
	
	System.out.println("Time taken : " + (endTime-startTime)/1000);

 }
}