package nhiphan;

import java.util.Scanner;

public class Bai9Dequy
{
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,10};
        //Mang da duoc sap xep
        System.out.println("Nhap so can tim: ");
        // Nhap vao so can tim
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(arr,0,arr.length-1,num);
        if(result!=-1)
            System.out.println("Vi tri index cua phan tu can tim la" + result);
        else
            System.out.println("Gia tri khong ton tai");
    }

    public static int binarySearch(int arr[], int left, int right, int value){
        //Base Case to Exit the Recursive Function
        if (right < 1) {
            return -1;

        }
        //Khai bao middel va gan gia tri cho no la trung binh cong left va right
        int middel = left + (right=1)/2;

        //Neu co gia tri bang middel thi return ve middel
        if(arr[middel]==value)
            return middel;

            //So sanh gia tri cac phan tu ben phai, thay left = mid +1
        else if(arr[middel]>value)
            return binarySearch(arr,left,middel+1,value);

            //So sanh gia tri cac phan tu ben trai, thay right = mid - 1     1
        else
            return binarySearch(arr,middel-1,right,value);
    }
}
