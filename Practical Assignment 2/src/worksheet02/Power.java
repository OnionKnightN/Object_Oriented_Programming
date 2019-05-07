// Has a package named worksheet02.
package worksheet02;

public class Power {
	public static void main(String args[]){
		// Prints headings of numbers a,b and pow(a, b).
		System.out.println("a\tb\tpow(a, b)");
		// Created an arrays called a and b with a list of numbers
		int a[]= {1,2,3,4,5};
		int b[]= {2,3,4,5,6};
		// Used a for loop to print of numbers(a list, b list) and powers of a and b arrays.
		for(int i=0; i<5; i++){
			// Created an integer called power to get the powers of a and b
			int power = (int)Math.pow(a[i],b[i]);
			// Prints out the list numbers a,b and pow(a, b)
            System.out.println(a[i] + "\t" + b[i] + "\t" + power);
       }
	}
}
