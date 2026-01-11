import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int num = sc.nextInt();

        int[] nArray = new int [n];

        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = sc.nextInt();
            if(nArray[i]<num){
               System.out.print(nArray[i] + " ");
            }
        } 
       sc.close();

    }
}
