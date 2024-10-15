import java.util.Scanner;

public class Q5 {

    //Strontio Number Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int copy = n;
        n = n*2;
        int one = n%100;
        one = one/10;
        int tens = n%1000;
        tens = tens/100;
        

        if (one == tens) {
            System.out.println(copy + " is a storntio number.  ");
        } else {
            System.out.println(copy + " is not a storntio number. ");
        }

    }
}
