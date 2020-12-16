import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Largura: ");
        float largura = x.nextFloat();
        System.out.print("Altura: ");
        float altura = x.nextFloat();
        float area = largura * altura;
        System.out.printf("%.2fL de tinta\n", area/2);
    }
}
