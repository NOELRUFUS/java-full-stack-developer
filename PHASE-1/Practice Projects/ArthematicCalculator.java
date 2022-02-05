import java.util.*;
class ArthematicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number " );
        int x = sc.nextInt();
        System.out.println("enter second number ");
        int y = sc.nextInt();
        System.out.println("select Operation");
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");
        System.out.println("5 for %");
        int z = sc.nextInt();
        switch(z){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;                
            case 4:
                System.out.println(x/y);
                break;                
            case 5:
                System.out.println(x%y);
                break; 
            default :
            System.out.println("invalid input");
        }
    }
}