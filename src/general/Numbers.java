package general;

public class Numbers {

	public void IsPrime(int num) {

		if (num>2) {
			int count = 0;
			for( int i = 2; i< num-1; i++) {

				if (num%i == 0) {
					count++;
					break;
				}
			}
			if (count>0) {
				System.out.println(num +" is a prime number");
			}else {
				System.out.println(num +" is NOT a prime number");
			}
		}

	}

	public void PrimeSeq(int maxNum) {


		for( int num = 2 ; num < maxNum; num ++) {
			
			if (num>2) {
				
				int count = 0;
				
				for( int i = 2; i< num-1; i++) {

					if (num % i == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.print(num+"\t");
				}
			}
		}

	}
	
	public void fiboseries(int count) {
		
		int num1 = 0, num2 = 1;
		
		System.out.print(num1 +"   "+num2);
		while(count > 0) {
			num2 = num1+ num2;
			System.out.print("   "+num2);
			num1 = num2 - num1;
			count--;
		}
	}
	
	public int fib(int n) {
		if (n <= 1) 
			return(1);
		return (fib(n-1)+ fib(n-2));
	}
}
