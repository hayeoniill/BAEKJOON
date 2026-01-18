import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'A';
            alpha[index]++;
        }

        int max = 0;
        int maxIndex = 0;

        for(int i=0;i<alpha.length;i++){
            if(alpha[i]>max){
                max = alpha[i];
                maxIndex = i;
            }
        }

        int v=0;
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]==max)
                v++;
            if(v>1){
                System.out.println("?");
                return;
            }
        }

        System.out.println((char)(maxIndex + 'A'));

        sc.close();
    }
}
