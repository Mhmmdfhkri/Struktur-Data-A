// Catatan: Perlu diketahui bahwa kelas Stack di Java adalah kelas lama dan 
// diwarisi dari Vector di Java. Ini adalah kelas thread-safe dan karenanya 
// melibatkan overhead saat kita tidak membutuhkan keamanan thread. Disarankan 
// untuk menggunakan ArrayDeque untuk implementasi stack karena lebih efisien 
// dalam lingkungan single-threaded.


// A Java Program to show implementation
// of Stack using ArrayDeque

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Deque<Character> stack = new ArrayDeque<Character>();
		stack.push('A');
		stack.push('B');
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
