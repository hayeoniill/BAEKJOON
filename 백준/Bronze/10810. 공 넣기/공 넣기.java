import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArray = new int[n];

        for(int index=0;index<m;index++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
        
            for(int start=i-1; start<j; start++){
                nArray[start] = k;
            }
        }
        
        
        for(int index = 0;index<nArray.length;index++){
            System.out.print(nArray[index] + " ");
        }
       sc.close();

    }
}
