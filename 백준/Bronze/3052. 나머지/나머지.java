import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nArray = new int[10];
        for(int i=0;i<nArray.length;i++){
            nArray[i]=1001;
        }
        
        for(int i=0;i<nArray.length;i++){
            int temp = 0;
            int n = sc.nextInt();
            for(int j=0;j<nArray.length;j++){
                if(n%42 == nArray[j])
                    temp++;
            }
            if(temp != 1)
                nArray[i] = n%42;
        }

        int count = 0;
        for(int i=0;i<nArray.length;i++){
            if(nArray[i] != 1001)
                count++;
        }
        System.out.println(count);

        sc.close();

    }
}
