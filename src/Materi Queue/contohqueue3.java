// 2. Menghapus Elemen: Untuk menghapus elemen dari antrian, kita dapat menggunakan metode remove(). 
// Jika ada beberapa objek seperti itu, maka kemunculan pertama objek tersebut akan dihapus. 
// Selain itu, metode poll() juga digunakan untuk menghapus kepala dan mengembalikannya.

// Java program to remove elements
// from a Queue

import java.util.*;

public class contohqueue3 {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Initial Queue " + pq);

		pq.remove("Geeks");

		System.out.println("After Remove " + pq);

		System.out.println("Poll Method " + pq.poll());

		System.out.println("Final Queue " + pq);
	}
}
