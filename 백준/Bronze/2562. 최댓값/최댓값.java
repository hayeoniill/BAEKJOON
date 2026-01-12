import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numArray = new int[9];
        int max = 0;
        int maxIndex=0;

        for(int i=0;i<numArray.length;i++){
            numArray[i] = sc.nextInt();
            if(numArray[i]>max){
                max = numArray[i];
                maxIndex=i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex+1);

       sc.close();

    }
}
