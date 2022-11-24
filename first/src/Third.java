import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int n;
        float result = 1;
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        System.out.print("Введите степень: ");
        n = scanner.nextInt();
        if (n<15 & n>-15){
            if (n>0){
                for(int i = 0; i < n; i++) {
                    result = result*x;
                }
            }
            if (n<0){
                for(int i = 0; i > n; i--) {
                    result = result/x;
                }
            }
            System.out.print("Итого: " + result);
        }else{
            System.out.print("ТЗ прочитай!");
        }
    }
}
