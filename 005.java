import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.printf("Número: ");
        int num = x.nextInt();
        System.out.printf("Dobro = %d\n", new Object[] {num*2});
        System.out.printf("Triplo = %d\n", new Object[] {num*3});
        System.out.printf("Square root = %f\n", new Object[] {Math.sqrt(num)});
    }
}
