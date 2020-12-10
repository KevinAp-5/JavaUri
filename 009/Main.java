import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Valor a converter: ");
        float num = x.nextFloat();
        System.out.printf("R$%.2f = $%.2f\n", num, num*5.03);
    }
}
