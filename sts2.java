import java.util.Scanner;
public class sts2 {
    public static void studentinfo(String name,int age, int id){
        System.out.println("the"+" "+"name"+" "+"is"+" "+name+" "+"with the id"+" "+id+" "+"with a age of "+" "+age);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your id");
        int id =sc.nextInt();
        studentinfo(name,age,id);

    }
}
