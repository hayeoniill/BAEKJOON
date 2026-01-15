import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
      
        String reverseA = new StringBuilder(a).reverse().toString();
        String reverseB = new StringBuilder(b).reverse().toString();

        int numA = Integer.parseInt(reverseA);
        int numB = Integer.parseInt(reverseB);

        if(numA>numB)
            System.out.println(numA);
        else if(numA<numB)
            System.out.println(numB);
        else
            System.out.println(numA);

        sc.close();
    }
}
