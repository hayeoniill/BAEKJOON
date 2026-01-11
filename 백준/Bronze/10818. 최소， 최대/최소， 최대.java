import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int min = 1000000;
        int max = -1000000;
        int[] nArray = new int [n];

        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = sc.nextInt();
            if(nArray[i]<min)
                min = nArray[i];
            if(nArray[i]>max)
                max = nArray[i];
        } 
        System.out.println(min + " " + max);
       sc.close();

    }
}
