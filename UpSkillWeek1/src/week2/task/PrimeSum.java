package week2.task;

public class PrimeSum

{
	static boolean isPrime(int num) 
	{  
		if(num == 1)   
		{  
			return false;  
		}
		for (int i = 2; i <= num/2; i++)   
		{  
			if (num % i == 0)   
			{  
				return false;  
			} 
		} 
		return true;  
	} 
	static class addPrime extends Thread
	{
		private int min,max;
		addPrime(int min,int max){
			this.min=min;
			this.max=max;

		}

		public void run() {
			int sum = 0;

			for (int i = min; i <= max; i++)   
			{  
				boolean prime = isPrime(i);  
				if (prime) 
				{   
					synchronized(this) {
						System.out.println("Thread name: Thread -"+this.getName()+" - Found prime: "+i);
						sum = sum + i;  

						try {
							this.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				} 

			} 
			System.out.println("The sum of all the prime number between the given range is:"+sum);
		}
	}


	public static void main(String args[])  

	{  
		int min = 0, max = 10;  
		addPrime t=new addPrime(min,max);
		t.start(); 

	} 
}
