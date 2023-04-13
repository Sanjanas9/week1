class Example1 
{   
  public static void main(String args[])
  {    
    int arr[]={1,2,3,5,7},sum=0;
    int sume=0,sumo=0;
    
    
    for(int i=0;i<arr.length;i++)
    {   
 if (arr[i]%2==0){
 {
    System.out.print( "even");
 }
   sume=sume+arr[i];
 }
   else{
      {
      System.out.print("odd"); 
    }
    sumo=sumo+arr[i];
}
     System.out.print(sum);
    sum=sum+arr[i];
  }
}
}