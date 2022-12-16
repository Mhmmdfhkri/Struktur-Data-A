// 3. Mengulangi queue: Ada beberapa cara untuk mengulang melalui queue. 
// Cara yang paling terkenal adalah mengonversi queue ke larik dan melintasi 
// menggunakan perulangan for. Namun, antrean juga memiliki iterator bawaan yang 
// dapat digunakan untuk melakukan iterasi melalui queue.


// Java program to iterate elements
// to a Queue

import java.util.*;

public class contohqueue4 {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
