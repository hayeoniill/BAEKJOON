import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0;
 
        while(true){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 >= n2 && n1 >= n3){
          max = n1;
        }else if(n2 >= n1 && n2 >= n3){
          max = n2;
        }
        else if(n3 >= n2 && n3 >= n1){
          max = n3;
        }

        if(n1 == 0 && n2 == 0 && n3 == 0)
          return;
        
        if(n1+n2+n3-max <= max ){
          System.out.println("Invalid");
        }
        else if(n1 == n2 && n2 == n3){
          System.out.println("Equilateral");
        }
        else if( (n1 == n2 && n2 != n3) || (n2 == n3 && n1 != n2) || (n1 == n3 && n2 != n1)){
          System.out.println("Isosceles");
        }
        else if(n1 != n2 && n2!= n3 && n1 != n3){
          System.out.println("Scalene");
        }
      }

      
      }

      
}
