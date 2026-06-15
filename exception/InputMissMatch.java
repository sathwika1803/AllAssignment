package exception;
import java.util.Scanner; 

import java.util.InputMismatchException; 
public class InputMissMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try{
                System.out.println("enter age");
                int age=sc.nextInt();
                System.out.println("age:"+age);
            }
            catch(InputMismatchException e){
                System.out.println("enter valid int");
                sc.nextLine();
            }
        }
    }

