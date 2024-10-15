import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        System.out.print(" N = ");
        int n = sc.nextInt();
        System.out.println("OUTPUT : ");
        if (n%2 != 0) {
            System.out.println("INVALID INPUT. NUMBER IS ODD");
        } else if(n<9 || n>50) {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE");
        }else {
            System.out.println("PRIME PAIRS ARE: ");
        int first = n-1;
        for (int i = 1; i <= n && i <= first; i++) {
            
            if (first%2 == 1 && i%2 == 1) {
                if (prime(first) == true && prime(i) == true) {
                    System.out.println(i + ", " + first);
                }
            }
            first--;
        }
    }
}

    //Goldbach No Program
    public static boolean prime(int n) {
        
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                count += 1;

                if (n/i != i) {
                    count += 1;
                }
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}