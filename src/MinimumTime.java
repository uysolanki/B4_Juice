import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTime {
	static int seconds;
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity of Mango Juice");
		pq.add(sc.nextInt());
		System.out.println("Enter Quantity of Orange Juice");
		pq.add(sc.nextInt());
		System.out.println("Enter Quantity of Pineapple Juice");
		pq.add(sc.nextInt());
		
	}
	public int calculateMinTime() {
		Iterator<Integer> list=pq.iterator();
		while(!pq.isEmpty()) //4
		{
			int val1=0; //5
			int val2=0; //4
			
			if(list.hasNext())
			{
				val1=pq.remove();
			}
			
			if(list.hasNext())
			{
				val2=pq.remove();
			}
			
			if(val1>0 && val2>0)
			{
				val1--;
				val2--;
				seconds++;
			}
			
			if(val1>0 && val2==0)
			{
				
				seconds=seconds+val1;
				break;
			}
			
			if(val1==0 && val2>0)
			{
				seconds=seconds+val2;
				break;
			}
			
			if(val1>0)
				pq.add(val1);
			if(val2>0)
				pq.add(val2);
		}
		return seconds;
		
		
	}

}
