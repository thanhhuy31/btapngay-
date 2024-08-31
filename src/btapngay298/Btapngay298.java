package btapngay298;

import java.util.Scanner;

public class Btapngay298 {
// Nhap mang so thuc

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
    }
    // xuat mang ra man hinh

    public static void printData(float[] arrays) {
        System.out.println("Cac phan tu cua mang:");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Tim gia tri lon thu 2 trong mang

    public static float findMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang khong co phan tu de tim gtri lon t2.");

        }
        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == Float.NEGATIVE_INFINITY) {
            System.out.println("Khong co phan tu lon thu 2 trong mang.");
            return Float.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang: ");
        int size = scanner.nextInt();

        float[] arrays = new float[size];
    }

}
