import java.io.*;
import java.util.Scanner;


class dez{
    public static void main(String args[]){
        int A, B, R;
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Entre o valor <A> :");
        A = s.nextInt();
        System.out.print("Entre o valor <B> :");
        B = s.nextInt();
        R = A + B;
        System.out.println();
        if(R > 1000){
            System.out.print("Resultado ultrapassa o valor 1000");
        }else{
            System.out.print("Resultado nao ultrapassa o valor 1000");
            System.out.println();
        }
    }
}