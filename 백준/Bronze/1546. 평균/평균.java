import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] scores = new double[n];
        double max =0;

        for(int i=0;i<n;i++){
            scores[i] = sc.nextDouble();
            if(scores[i]>max)
                max = scores[i];
        }

        double avg = 0;

        for(int i =0;i<n;i++){
            scores[i] = scores[i]/max*100;
            avg += scores[i];
        }

        System.out.println(avg/n);

        sc.close();

    }
}
