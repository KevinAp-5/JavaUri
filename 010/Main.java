// lenght converter
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Altura em metros: ");
        float meters = x.nextFloat();
        System.out.printf("%.2f meter = %.2f foot\n", meters, meters*3.281);
    }
}
