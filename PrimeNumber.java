
package primenumber;

public class PrimeNumber {

    public static boolean isPrime(int n)
    {
        boolean prime=true;
        if(n==1)
           return false;
       
        for(int i=2;i<n/i+1;i++)
        {
           
        if (n%i==0)
        { 
            prime=false;
        
            break;
        }
        }
         
        return prime;
    }
       
    
    public static int checkPrimes(int a,int b){
        int counter = 0;
        for(int i=a;i<=b;i++)
            if(isPrime(i))
                counter++;
        return counter;
    
    }
    public static void main(String[] args) {
        //int c=0;
       /* for(int i=2;i<100;i++)
            if (isPrime(i))
            {    
                 System.out.println(i);
                 //c++;
            } */
     System.out.println(checkPrimes(2,100));
    }
    
}