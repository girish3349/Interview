package general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Strings {
	
	//abcdafgbcacbca
	//Output: 
	/*[a, b, c, d, f, g]
	a  - is appared for 4 time(s)
	b  - is appared for 3 time(s)
	c  - is appared for 4 time(s)
	d  - is appared for 1 time(s)
	f  - is appared for 1 time(s)
	g  - is appared for 1 time(s) */
	public void dupchar(String str) {
		
		String st = str.toLowerCase();
		char arr[] = st.toCharArray();
		
		Set<Character> se =  new HashSet<Character>();
		
		for (char ch: arr) {
			se.add (ch);
		}
		
		System.out.println(se);
		if (arr.length == se.size()) {
			System.out.println("No Duplicate chars");
		}
		Iterator it = se.iterator();
		
		while (it.hasNext()) {
			int i=0;
			char dup = (char) it.next();
			for (char ch: arr)
			if (dup == ch) {
				i++;	
			}
			System.out.println(dup+"  - is appared for "+ i +" time(s)");
		}
	}
	
	
	// Input: Girish Mrudula
	// Output : aludurM hsiriG
	public void reverse(String str) {
		String rev = "";
		for (int i= str.length()-1 ; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
	
	//Input: Let's see the example to reverse each word in a string.
	//Output : string. a in word each reverse to example the see Let's 
	public void revWords(String str) {
		
		String rev[] = str.split("\\s");
		
		for (int i =rev.length-1; i >=0; i--) {
			System.out.print(rev[i]+ " ");
		}
	}
	
	//Input: 9
	//Output: 0  1   1   2   3   5   8   13   21   34   
	public void fibo(int n) {
		int n1 =0, n2 =1;
		System.out.print(n1 +"  " +n2 + "   ");
		for (int i=0 ; i<n-1; i++) {
			System.out.print(n1 + n2 + "   ");
			n2 += n1;
			n1 = n2-n1;
		}
	}
	
	
	//Input : 19
	// Ouput : 19 is a Prime number
	
	//Input : 49
	//Output : 49 is NOT a Prime number
	
	public void isPrime(int n) {
		boolean prime = true;
			for (int i=2; i<(n/2)+1; i++) {
				if (n%i == 0) {
					prime = false;
					break;
				}
			}
		if (prime)
			System.out.println(n + " is a Prime number");
		else
			System.out.println(n + " is NOT a Prime number");
		
		
	}
	
	
	//Input: abcdafgbcacbca
	//Output: 11cd2fg2c3c3ca
	
	//Replace occurrences of a and b chars with numbers. 
	
	public void charreplace(String str) {
		
		char arr[] = str.toCharArray();
	      for (int i=0, a=1, b=1; i<arr.length-1; i++){
	          
	      //arr[i] = str.charAt(i); 
	      if (arr[i] == 'a'){
	          arr[i] = Character.forDigit(a++,10);
	      }
	      if (arr[i]== 'b'){
	          arr[i] = Character.forDigit(b++, 10);
	      }
	    }
	      System.out.println(str+" : "+String.valueOf(arr));
	}
	
	
	//Input: 45072304 : 
	//Output : [45, 50, 7, 72, 23, 30, 4]  :  72

	public void getbiggestnum(String str) {

		List<Integer> intlist = new ArrayList<Integer>();
		
		for (int i = 0; i< str.length()-1 ; i++) {			
			intlist.add(Integer.valueOf(str.substring(i, i+2)));			
		}
		
		int big = intlist.get(0);		
		
		for (int i:intlist) {
			if (big <= i){
				big = i;
			}
		}		
		System.out.println(str +" : "+intlist+"  :  "+ big);
	}
	
	

}
