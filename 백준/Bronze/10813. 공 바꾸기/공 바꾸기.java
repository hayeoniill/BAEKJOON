import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArray = new int[n];

        for(int i=0;i<nArray.length;i++){
            nArray[i]=i+1;
        }

        for(int index=0;index<m;index++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = nArray[i-1];
            nArray[i-1] = nArray[j-1];
            nArray[j-1] = temp;
           
        }

        for(int i=0;i<nArray.length;i++){
            System.out.print(nArray[i] + " ");
        }

        sc.close();

    }
}
