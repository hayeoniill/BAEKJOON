import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int v=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'c'){
                if (i + 1 < s.length() && s.charAt(i+1) == '='){
                    i++;
                    v++;
                }
                else if (i + 1 < s.length() && s.charAt(i+1) == '-'){
                    i++;
                    v++;
                }
                else
                    v++;    
            }

            else if(s.charAt(i)=='d'){
                if (i + 1 < s.length() && s.charAt(i+1) == '-'){
                    i++;
                    v++;
                }
                else if (i + 2 < s.length() && s.charAt(i+1) == 'z' && s.charAt(i+2)=='='){
                    i+=2;
                    v++;
                }
                else v++;
            }

            else if(s.charAt(i)=='l'){
                if(i+1<s.length() && s.charAt(i+1)=='j'){
                    i++;
                    v++;
                }
                else
                    v++;
            }

            else if(s.charAt(i)=='n'){
                if(i+1<s.length() && s.charAt(i+1)=='j'){
                    i++;
                    v++;
                }
                else
                    v++;
            }

            else if(s.charAt(i)=='s'){
                if(i+1<s.length() && s.charAt(i+1)=='='){
                    i++;
                    v++;
                }
                else
                    v++;
            }

            else if(s.charAt(i)=='z'){
                if(i+1<s.length() && s.charAt(i+1)=='='){
                    i++;
                    v++;
                }
                else
                    v++;
            }
            else
                v++;
       }
       System.out.println(v);
        sc.close();
    }
}
