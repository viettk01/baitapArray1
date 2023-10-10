import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//                       Marix A
        System.out.println("nhap so dong cua matrix A");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so cot cua matrix A");
        int columnA = Integer.parseInt(scanner.nextLine());

        int [][] matrixA = new int[rowA][columnA];

//                       Matrix B
        System.out.println("nhap so dong cua matrix B");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so cot cua matrix B");
        int columnB = Integer.parseInt(scanner.nextLine());

        int [][] matrixB = new int[rowB][columnB];

//                 Ktra số hàng và cột của 2 matrix

        if (rowA != rowB || columnA != columnB) {
            System.out.println("so dong va cot cua 2 matrix la khac nhau nen khong the tinh");
        } else {
            //                 Nhập giá trị matrix A
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.println("nhap gia tri cua matrix A dong "+(i+1)+ " cot " +(j+1));
                    matrixA[i][j] = scanner.nextInt();
                }

            }

//                 Nhập giá trị matrix B
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.println("nhap gia tri cua matrix B dong "+(i+1)+ " cot " +(j+1));
                    matrixB[i][j] = scanner.nextInt();
                }
            }
        }


//            tinh tong (sum)
        int[][] sum = new int[rowA][columnA];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

//        ket qua
        System.out.println("ket qua:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}


