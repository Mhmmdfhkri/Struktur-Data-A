// Melakukan berbagai operasi pada kelas Stack



// 1. Menambahkan Elemen: Untuk menambahkan elemen ke stack, 
// kita dapat menggunakan metode push(). Operasi push() ini 
// menempatkan elemen di bagian atas stack


// Java program to add the
// elements in the stack

import java.io.*;
import java.util.*;

class contohstack2 {
	
	// Main Method
	public static void main(String[] args)
	{

		// Default initialization of Stack
		Stack stack1 = new Stack();

		// Initialization of Stack
		// using Generics
		Stack<String> stack2 = new Stack<String>();

		// pushing the elements
		stack1.push(4);
		stack1.push("All");
		stack1.push("Geeks");

		stack2.push("Geeks");
		stack2.push("For");
		stack2.push("Geeks");

		// Printing the Stack Elements
		System.out.println(stack1);
		System.out.println(stack2);
	}
}
