// 2. LinkedList: LinkedList adalah kelas yang diimplementasikan dalam kerangka koleksi 
// yang secara inheren mengimplementasikan struktur data daftar tertaut. Ini adalah struktur
//  data linier di mana elemen tidak disimpan di lokasi yang berdekatan dan setiap elemen
//   adalah objek terpisah dengan bagian data dan bagian alamat. Elemen-elemen dihubungkan
//    menggunakan pointer dan alamat. Setiap elemen dikenal sebagai node. Karena dinamika 
//    dan kemudahan penyisipan dan penghapusan, mereka lebih disukai daripada larik atau 
//    antrean. Mari kita lihat cara membuat objek antrian menggunakan kelas ini.


// Java program to demonstrate the
// creation of queue object using the
// LinkedList class

import java.util.*;

class GfG {

	public static void main(String args[])
	{
		// Creating empty LinkedList
		Queue<Integer> ll
			= new LinkedList<Integer>();

		// Adding items to the ll
		// using add()
		ll.add(10);
		ll.add(20);
		ll.add(15);

		// Printing the top element of
		// the LinkedList
		System.out.println(ll.peek());

		// Printing the top element and removing it
		// from the LinkedList container
		System.out.println(ll.poll());

		// Printing the top element again
		System.out.println(ll.peek());
	}
}
