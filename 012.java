import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Preço do produto: ");
        float valor = x.nextFloat();
        double descontado = valor - ((valor * 5) / 100);
        System.out.printf("Preço com desconto: R$%.2f\n", descontado);
    }
}
