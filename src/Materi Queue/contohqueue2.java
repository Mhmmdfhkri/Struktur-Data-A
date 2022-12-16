// Operasi pada Queue Interface
// Mari kita lihat bagaimana melakukan beberapa operasi yang sering digunakan pada queue menggunakan kelas Priority Queue.

// 1. Menambahkan Elemen: Untuk menambahkan elemen dalam antrian, kita dapat menggunakan metode add(). 
// Urutan penyisipan tidak disimpan di PriorityQueue. Elemen disimpan berdasarkan urutan prioritas 
// yang naik secara default.

// Java program to add elements
// to a Queue

import java.util.*;

public class contohqueue2 {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println(pq);
	}
}

