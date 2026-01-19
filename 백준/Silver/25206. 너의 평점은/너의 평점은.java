import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double score = 0.0;
        Double finalCredit = 0.0;
        Double finalScore = 0.0;

        for(int i=0;i<20;i++){
            String name = sc.next();
            Double credit = sc.nextDouble();
            String grade = sc.next();
            
            if(grade.equals("A+")){
                finalCredit+=credit;
                finalScore += credit*4.5;
            }else if (grade.equals("A0")){
                finalCredit+=credit;
                finalScore += credit*4.0;
            }else if (grade.equals("B+")){
                finalCredit+=credit;
                finalScore += credit*3.5;
            }else if (grade.equals("B0")){
                finalCredit+=credit;
                finalScore += credit*3.0;
            }else if (grade.equals("C+")){
                finalCredit+=credit;
                finalScore += credit*2.5;
            }else if (grade.equals("C0")){
                finalCredit+=credit;
                finalScore += credit*2.0;
            }else if (grade.equals("D+")){
                finalCredit+=credit;
                finalScore += credit*1.5;
            }else if (grade.equals("D0")){
                finalCredit+=credit;
                finalScore += credit*1.0;
            }else if (grade .equals("F")){
                finalCredit+=credit;  
            }
        }
        System.out.println( finalScore/finalCredit);
        sc.close();
    }
}
