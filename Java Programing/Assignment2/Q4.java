import java.util.Scanner;
public class Q4 {

    // Kaprekar number / Capricorn numbe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = sc.nextInt();
        int c = n;
        n = n*n;
        String s = Integer.toString(n);
        String s1 = "", s2 = "", s3 = "", s4 = "";
        int i = 0;
        while (i < s.length()) {
            
                if (i<s.length()/2) {
                    s1 += s.charAt(i);
                    
                } else {
                    s2 += s.charAt(i);
                    
                }
                if (s.length()%2 != 0)  {
                    if (i<s.length()/2+1) {
                        s3 += s.charAt(i);
                        
                    } else {
                        s4 += s.charAt(i);
                }
            }
            i++;
        }
        int ans1 =  Integer.parseInt(s1) + Integer.parseInt(s2);
        int ans2 =  Integer.parseInt(s3) + Integer.parseInt(s4);
        
        if (ans1 == c || ans2 == c) {
            System.out.println("YES");
            System.out.println("Explanation: "+ c+  " = " +c*c+ " and " + s1 + " + " +s2+ " or " +s3+ " + " +s4+ " is equal to " +c );
        } else {
            System.out.println("NO");
            System.out.println("Explanation: "+ c+  " = " +c*c+ " and " + s1 + " + " +s2+ " nor " +s3+ " + " +s4+ " is equal to " +c );
        }
       
    }
}
