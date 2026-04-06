import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            
            String S = sc.next();
            String Tstr = sc.next();
            
            StringBuilder M = new StringBuilder();
            
            for (int i = 0; i < 5; i++) {
                if (S.charAt(i) == Tstr.charAt(i)) {
                    M.append('G');
                } else {
                    M.append('B');
                }
            }
            
            System.out.println(M.toString());
        }
    }
}