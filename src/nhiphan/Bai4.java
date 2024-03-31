package nhiphan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4
{ // Tim kiem nhi phan tim ra vi tri index cua phan tu
    public static void main(String[] args)
    {
        // B1 : Cho nhap mang tang dan tu ban phim
        int [] arrNumber = new int [6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri tang dan cho mang" );
        for (int i = 0; i < arrNumber.length ; i++)
        {
            System.out.println("Moi ban nhap vao phan tu thu " + (i +1));
            int num = Integer.parseInt(scanner.nextLine());
            arrNumber[i] = num;
            if (num>arrNumber.length||num<0){
                System.out.println("Gia tri khong hop le");
            }
        }
        System.out.println(Arrays.toString(arrNumber));
        //B2 : Nhap so can tim
        System.out.println("Moi ban nhap so can tim");
        int numberSearch = Integer.parseInt(scanner.nextLine());
        //B3 : Tim so lon nhat can tim bang nhi phan
        int middle;
        int left = 0;
        int right = arrNumber.length-1;
        while (right>= left) {
            middle = (left + right) / 2;
            if(arrNumber[middle] == numberSearch){
                System.out.println("So can tim o vi tri thu" + middle);
            }
            if(numberSearch > arrNumber[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    }
}
