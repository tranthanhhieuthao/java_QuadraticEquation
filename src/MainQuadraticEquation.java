import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a:");
        double a =scanner.nextDouble();
        System.out.println("input b:");
        double b = scanner.nextDouble();
        System.out.println("input c:");
        double c =scanner.nextDouble();

        quadraticEquation.setparametter(a,b,c);

        if (quadraticEquation.getDiscriminant() >0){
            System.out.println("Root1 ="+" "+quadraticEquation.getRoot1()+"\n"+"Root2="+" "+quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Have only 1 Root="+" "+quadraticEquation.getRoot1());
        }
        else System.out.println("The equation has no roots");

    }
}
