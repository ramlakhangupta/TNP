import java.util.Scanner;
public class Q3 {
    
    //Abundant number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int n = sc.nextInt();
        int sum = 1; // sum = 1 because we start i = 1 
        //loop running 2 to sqrt of n times 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) { // by this we have to be check the ith no 
                sum += i;
                int temp = n/i; // if ith is divisible to n then also his quotient is also divisble to n 
                sum += temp;
            }
        }
        if (sum >= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
