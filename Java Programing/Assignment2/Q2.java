import java.util.Scanner;

public class Q2 {
    //Prime-Adam No.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int a = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int b = sc.nextInt();
        int count = 0;
        System.out.println("THE Prime Adam Numbers are : ");
        while (a<b) {
            if (prime(a)) {
                int n = reverse(a);
                int sq = n*n;
                sq = reverse(sq);
                if (sq == a*a) {
                    System.out.print(a + "  ");
                    count++;
                }
            }
            a++;

        }
        System.out.println();
        if (count>0) {
            System.out.print("The Frequency of Prime Adam Number is : " +count);

        } else {
            System.out.println("NIL");
            System.out.print("The Frequency of Prime Adam Number is : " +count);

        }
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n!= 0) {
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }


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
