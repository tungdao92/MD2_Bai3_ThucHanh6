import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng sinh viên tham gia thi:");
            size = scanner.nextInt();
            if (size > 30){
                System.out.println("Kích thước không được vượt quá 30");
            }
        }
        while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập điểm của sinh viên" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10){
                count++;
            }

        }
        System.out.println("Số lượng sinhh viên thi đỗ là: " + count);
    }
}
