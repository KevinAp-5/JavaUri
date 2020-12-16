import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.printf("Número: ");
        int num = x.nextInt();
        System.out.printf("%d, %d, %d\n", new Object[] {num-1, num, num+1});
    }
}
