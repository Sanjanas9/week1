class Example1 
{   
  public static void main(String args[])
  {
	
		int arr[] = {1, 2, 3, 4, 5, 6 };
		int even = 0, odd = 0,sum=0,evens=0,odds=0;
    	for (int i=0; i< arr.length;i++) 
    
			if (arr[i]% 2 == 0)
      {
				even++;
        evens=evens+arr[i];
      }
      else
      {
				odd++;
        odds=odds+arr[i];
      }
    

		System.out.println("Even sum: " + evens);
		System.out.println("Odd sum: " + odds);	System.out.println("Even : " + even);
    	System.out.println("odd: " + odd);
    	System.out.println("sum: " + sum);
    
	}
  }
