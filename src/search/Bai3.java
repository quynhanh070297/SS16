package search;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3
{ //Đề bài: Viết chương trình tìm kiếm tuyến tính trong mảng số nguyên, nhập mảng và giá trị cần tìm từ bàn phím. In ra vị trí của giá trị cần tìm nếu nó có trong mảng, ngược lại in ra thông báo không tìm thấy.

    // B1  mảng cho sẵn phần tử
    private static int[] getArr(){
        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args)
    {// B2: lấy số cần tìm từ scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao mot so can tim");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arrNumber = getArr();
        System.out.println(Arrays.toString(arrNumber));
        //　B3: tìm số trong mảng và in ra.
      boolean  check = false;
        for (int i = 0; i < arrNumber.length ; i++)
        {
            if (number == arrNumber[i]){
                System.out.println("Xuat hien trong mang   " + arrNumber[i] );
                check = true;
            }
        }
        if (!check){
            System.out.println("Khong xuat hien trong mang");
        }
    }
}
