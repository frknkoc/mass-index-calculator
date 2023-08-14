import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Height, Weight, Index;

        System.out.println("Please, enter your height(kg).");
        Scanner height = new Scanner(System.in);
        Height = height.nextDouble();

        System.out.println("Please, enter your weight(m).");
        Scanner weight = new Scanner(System.in);
        Weight = weight.nextDouble();

        Index = Height / (Weight * Weight);
        String Result = "";
        if (Index < 20) {
            Result = "Your mass index is too low, you need to gain weight urgently!!!";
        } else if (Index >= 20 && Index <= 25) {
            Result = "Ideal condition of your mass index.";
        } else {
            Result = "Your mass index is too high";
        }

        System.out.println("Kitle indeksin : " + Index + " " + Result);
    }
}