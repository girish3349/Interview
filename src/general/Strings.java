package general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Strings {
	
	
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
		Iterator<Character> it = se.iterator();
		
		while (it.hasNext()) {
			int i=0;
			char dup = it.next();
			for (char ch: arr)
			if (dup == ch) {
				i++;	
			}
			System.out.println(dup+"  - is appared for "+ i +" time(s)");
		}
	}
	
	public void reverse(String str) {
		String rev = "";
		for (int i= str.length()-1 ; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void revWords(String str) {
		
		String rev[] = str.split("\\s");
		
		for (int i =rev.length-1; i >=0; i--) {
			System.out.print(rev[i]+ " ");
		}
		System.out.println("");
	}
	
	public void fibo(int n) {
		int n1 =0, n2 =1;
		System.out.print(n1 +"  " +n2 + "   ");
		for (int i=0 ; i<n-1; i++) {
			System.out.print(n1 + n2 + "   ");
			n2 += n1;
			n1 = n2-n1;
		}
	}
	
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
	
	public void charreplace(String str) {
		
		char arr[] = str.toCharArray();
	      for (int i=0, a=1, b=1; i<arr.length-1; i++){
	          
	      if (arr[i] == 'a'){
	          arr[i] = Character.forDigit(a++,10);
	      }
	      if (arr[i]== 'b'){
	          arr[i] = Character.forDigit(b++, 10);
	      }
	    }
	      System.out.println(str+" : "+String.valueOf(arr));
	}
	
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
