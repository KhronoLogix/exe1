import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("hello world!");

        int age = 17;
        double gpa = 3.2;
        boolean isSnowing = true;
        System.out.println(age + "|" + gpa + "|" + isSnowing);
        String city = "Denver";
        System.out.println(city);

        float pi = 3.14592f;
        System.out.println(pi);

        int dailyHigh[] = {50,60,70,80,90};
        System.out.println(dailyHigh[0]);
        System.out.println(dailyHigh[1]);
        System.out.println(dailyHigh[2]);
        System.out.println(dailyHigh[3]);
        System.out.println(dailyHigh[4]);
        System.out.println('|');
        for(int i=0; i<=4; i++){
            System.out.println(dailyHigh[i]);
        }

        int twoDArray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(twoDArray[0][1]);

        int sum = 3+2;
        System.out.println(sum);

        int i = 1;
        int res = ++i * 2;
        System.out.println(res);

        System.out.println("how old are you");
        age = input.nextInt();
        input.nextLine();
        System.out.println("i predict you are" + age + "years old");

        System.out.println("give me your name");
        String name = input.nextLine();
        System.out.println("hello" + name);


    }
}