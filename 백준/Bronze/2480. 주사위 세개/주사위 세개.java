import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int money = 0;
    int max = 0;

    //같은눈 3개
    if(a==b && b==c){
        money = 10000 + (a)*1000;
    }//같은눈 2개개
    else if( a==b && b!= c){
        money = 1000+(a)*100;
    }else if (a==c && a != b) {
        money = 1000+(a)*100;
    }else if (b==c && a!= b){
        money = 1000+(b)*100;
    }else{ //모두 다른 눈눈
        if(a>b && a>c)
            max = a;
        else if(b>a && b>c)
            max =b;
        else
            max = c;

        money = max*100;
    }
    System.out.println(money);
    sc.close();
    }
}
