import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int n;
        int nMinus = 0;
        int result = 0;
        System.out.print("Введите число точек: ");
        x = scanner.nextInt();
        if (x<0){
            System.out.print("Ты дурак?");
            System.exit(0);
        }
        System.out.print("Введите окружность: ");
        n = scanner.nextInt();
        if (n<0){
            System.out.print("Понятно...");
            System.exit(0);
        }else{
             nMinus = n*(-1);
        }
        for(int i = 0; i < x; i++) {
            System.out.print("Введите X" + i + " точки ");
            int first = scanner.nextInt();
            System.out.print("Введите Y" + i + " точки ");
            int second = scanner.nextInt();
            if((first<n & first>nMinus)&(second<n & second>nMinus)){
                result++;
            }
        }
        System.out.print( result + " точек попали в окружность");
    }
}
