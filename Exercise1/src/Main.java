import java.util.Scanner;
//Dominic Cruz / 1/16/25 / EXE 1
// please add roblos
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //loser ez example with only print statements
        System.out.println("here's and example of what you'll see when your done!");
        String exCity = "Denver";
        int exZip = 80250;
        int exTempAvg = (32 + 25 + 27 + 40 + 45) / 5;
        System.out.println(exCity);
        System.out.println(exZip);
        System.out.println(exTempAvg);
        //super cool also kinda ez user inputted stuffs
        System.out.println("what city do you live in?");
        String userCity = input.nextLine();
        input.nextLine();
        System.out.println("and your zip code?");
        int userZip = input.nextInt();
        input.nextLine();
        System.out.println("give me the 5 temps you want averaged");
        int temp1 = input.nextInt();
        input.nextLine();
        int temp2 = input.nextInt();
        input.nextLine();
        int temp3 = input.nextInt();
        input.nextLine();
        int temp4 = input.nextInt();
        input.nextLine();
        int temp5 = input.nextInt();
        input.nextLine();
        int userTempAvg = (temp1 + temp2 + temp3 + temp4 + temp5)/5;
        //prints what the user inputs as the same style that the exercise required
        System.out.println(userCity);
        System.out.println(userZip);
        System.out.println(userTempAvg);
    }
}
