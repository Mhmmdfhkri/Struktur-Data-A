// 3. PriorityBlockingQueue: Perlu dicatat bahwa implementasi, PriorityQueue dan LinkedList
//  tidak thread-safe. PriorityBlockingQueue adalah salah satu implementasi alternatif jika 
//  implementasi thread-safe diperlukan. PriorityBlockingQueue adalah antrean pemblokiran
//   tak terbatas yang menggunakan aturan pengurutan yang sama dengan kelas PriorityQueue 
//   dan memasok operasi pengambilan pemblokiran.
// Karena tidak dibatasi, penambahan elemen terkadang gagal karena kehabisan sumber daya
//  yang mengakibatkan OutOfMemoryError. Mari kita lihat cara membuat objek antrian menggunakan kelas ini.

// Java program to demonstrate the
// creation of queue object using the
// PriorityBlockingQueue class

import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

class GfG {
	public static void main(String args[])
	{
		// Creating empty priority
		// blocking queue
		Queue<Integer> pbq
			= new PriorityBlockingQueue<Integer>();

		// Adding items to the pbq
		// using add()
		pbq.add(10);
		pbq.add(20);
		pbq.add(15);

		// Printing the top element of
		// the PriorityBlockingQueue
		System.out.println(pbq.peek());

		// Printing the top element and
		// removing it from the
		// PriorityBlockingQueue
		System.out.println(pbq.poll());

		// Printing the top element again
		System.out.println(pbq.peek());
	}
}
