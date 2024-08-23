/* the decision making (if,else) code on grading system    (sts class) */
import java.util.Scanner;
public class sts1{
    public static void grade(int marks,String name){
        if(marks>=90 & marks<=100){
            System.out.println(name+","+"the grade is S");
    }
        if(marks>=80 & marks<=90){
        System.out.println(name+"," +"the grade is A");
    }
        if(marks>=70 & marks<=80){
        System.out.println(name+","+"the grade is B");
    }
        if(marks>=60 & marks<=70){
        System.out.println(name+","+"the grade is D");
    }
        if( marks<=50){
        System.out.println(name+","+"the grade is D");
    }
        }     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter your marks to know ur grade :");
        int marks = sc.nextInt();
        grade(marks,name);

        
    }
}