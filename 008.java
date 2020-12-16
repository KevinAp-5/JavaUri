import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Número: ");
        int num = x.nextInt();
        for (int i = 0; i<11; i++){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
}
