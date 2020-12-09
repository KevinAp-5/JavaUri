import java.util.*;  
class Main{  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in); 
        System.out.printf("Primeiro número:  ");
        int a = in.nextInt();
        System.out.printf("Segundo número:  ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.printf("Soma dos números = %d\n", new Object[] {sum});
    }
}
