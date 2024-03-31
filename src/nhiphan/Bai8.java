package nhiphan;

import java.util.Scanner;

public class Bai8
{ // Sap xep ky tu theo alpha B
        public static void main(String[] args){
            //B1 : Cho nguoi dung nhap vao mot chuoi muon xap sp
            Scanner scanner = new Scanner(System.in);
            String inputString= scanner.nextLine();
            //B2 : Phương thức toCharArray() là một hàm Java
            // tích hợp cho phép bạn chuyển đổi một chuỗi thành một
            // mảng ký tự và mỗi ký tự của chuỗi thành một phần tử của mảng.
            char[] word=inputString.toCharArray();
            // B3 : Dung BBS
            for(int i=0;i<(word.length-1);i++){
                for(int j=i+1;j>0;j--){
                    if(word[j]<word[j-1]){
                        char temp=word[j-1];
                        word[j-1]=word[j];
                        word[j]=temp;
                    }
                }
            }
            inputString=String.valueOf(word);
            System.out.println(inputString);
        }
}
