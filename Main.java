package UtsProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Jumlah Array
        System.out.print("Input Jumlah Angka : ");
        int jmlhData = input.nextInt();

        // Input Data
        int[] Data = new int[jmlhData];
        for (int i = 0; i < Data.length; i++) {
            System.out.print("Input Data: ");
            Data[i] = input.nextInt();
        }
        MethodSotirData Sortir = new MethodSotirData();
        System.out.println(Sortir.SortirData(Data));
    }
}
