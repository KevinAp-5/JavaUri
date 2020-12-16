import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Metros: ");
        float metros = x.nextFloat();
        System.out.println("Centímetros: = " + metros*100);
        System.out.println("Milímetros: = " + metros*1000);
    }
}
