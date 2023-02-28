import java.util.Scanner;

public class Nhapmatran {
   public static void main(String[] args) {
      int rows, columns;
      Scanner input = new Scanner(System.in);

      // Nhập số dòng và số cột của ma trận
      System.out.print("Nhập số dòng của ma trận: ");
      rows = input.nextInt();
      System.out.print("Nhập số cột của ma trận: ");
      columns = input.nextInt();

      int[][] matrix1 = new int[rows][columns];
      int[][] matrix2 = new int[rows][columns];
      int[][] sum = new int[rows][columns];

      // Nhập giá trị cho ma trận thứ nhất
      System.out.println("Nhập giá trị cho ma trận thứ nhất:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix1[i][j] = input.nextInt();
         }
      }

      // Nhập giá trị cho ma trận thứ hai
      System.out.println("Nhập giá trị cho ma trận thứ hai:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix2[i][j] = input.nextInt();
         }
      }

      // Cộng hai ma trận
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }

      // Xuất ma trận tổng
      System.out.println("Ma trận tổng:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            System.out.print(sum[i][j] + " ");
         }
         System.out.println();
      }
   }
}
