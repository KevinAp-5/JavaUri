import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Celsius: ");
        float c = x.nextFloat();
        String f = String.format("%.2f", (c * 9/5) + 32);
        System.out.println(f+"°F");
    }
}
