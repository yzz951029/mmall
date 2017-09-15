import java.util.*;
import java.lang.*;

public class Main{
    private static boolean isPrime(int n){
        if(n==2)
            return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> prime = new ArrayList<>();

    private static void addPrime(){
        for(int i=2;i<=1000;i++){
            if(isPrime(i))
                prime.add(i);
        }
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        addPrime();
        int beg = 0;
        int end = prime.size()-1;
        int res = 0;
        while(beg<=end){
            if(prime.get(beg)+prime.get(end)==n){
                res++;
                beg++;
                end--;
            }
            else if(prime.get(beg)+prime.get(end)<n)
                beg++;
            else
                end--;
        }
        System.out.println(prime);
        System.out.println(res);
    }
}