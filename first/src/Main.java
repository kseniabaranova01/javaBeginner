import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int nowYear = 2022;
        int nowDay = 31;
        int nowMouth = 12;

        System.out.println("введите год рождения");
        int year = scanner.nextInt();
        if (nowYear < year){
            System.out.println("Позже поговорим");
            System.exit(0);
        }
        System.out.println("введите день рождения");
        int day = scanner.nextInt();
        System.out.println("введите месяц рождения");
        int mouth = scanner.nextInt();

        int n1 = year-nowYear;
        int n2 = nowDay-day;
        int n3 = nowMouth-mouth;

        System.out.println(n1 + " лет " + n3+" месяцев "+ n2+" дней ");
    }

}


