import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Salário: ");
        float salario = x.nextFloat();
        String aumento = String.format("%.2f", salario + ((salario * 15) / 100));
        // System.out.printf("Salário com 15% de aumento: R$%.2f", aumento);
        System.out.println("Salário com 15% de aumento: R$" + aumento);
    }
}
