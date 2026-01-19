import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int [][] arr = new int[9][9];
        int max =0;
        int maxW=0;
        int maxH=0;        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int n = sc.nextInt();
                arr[i][j]=n;
                if(n>=max){
                    max=n;
                    maxW = i+1;
                    maxH = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(maxW + " " + maxH);

        sc.close();
    }
}
