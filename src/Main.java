import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int N = sc.nextInt();
        // Conversion de N en binaire
        String binaire = Integer.toBinaryString(N);
        System.out.println("Représentation binaire : " + binaire);
    }