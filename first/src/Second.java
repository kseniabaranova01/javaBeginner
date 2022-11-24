import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int day;
        String seasonString;
        System.out.print("Введите месяц: ");
        month = scanner.nextInt();
        System.out.print("Введите число: ");
        day = scanner.nextInt();
        switch (month) {
            case 12: case 1: case 2: seasonString = "Зима ";break;
            case 3: case 4: case 5: seasonString = "Весна ";break;
            case 6: case 7: case 8: seasonString = "Осень";break;
            case 9: case 10: case 11: seasonString = "Лето";break;
            default: seasonString = "Ошибка";break;
        }
        System.out.print(seasonString);
}
}
