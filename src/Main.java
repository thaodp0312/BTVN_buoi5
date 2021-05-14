import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        songuyento100();
        System.out.println();
        System.out.println("Hãy nhập số n = ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        songuyentodautien(i);
        Scanner sc2 = new Scanner(System.in);
        giaithua gt = new giaithua();
        System.out.println();
        System.out.println(i+"! = "+gt.tinhgiaithua(i));
        System.out.println(i+ " số fibonaci đầu tiên: ");
        dayfibonaci(i);
        System.out.println();
        sofibonaci100();
            }

    static void songuyento100() {
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        nguyento nt = new nguyento();
        for (int i = 0; i < 100; i++) {
if (nt.checknguyento(i)==true){
    System.out.print(i+"\t");
}
        }
    }
    static void songuyentodautien(int x){
        int i = 0;
        int n=0;
        nguyento nt = new nguyento();
        System.out.println(x +" số nguyên tố đầu tiên:");
        while (n<x){
            if (nt.checknguyento(i)==true){
                System.out.print(i+"\t");
                n++;
            }
            i++;
                    }
    }
    static void dayfibonaci(int y){
        fibonaci fb = new fibonaci();
        int n=1;
        while (n<=y){
            System.out.print(fb.fibo(n)+"\t");
            n++;
        }
    }
    static void sofibonaci100() {
        System.out.println("Các số fibonaci nhỏ hơn 100: ");
        int i=1;
        fibonaci nt = new fibonaci();
       while (nt.fibo(i)<100){
           System.out.print(nt.fibo(i)+"\t");
           i++;
       }
    }
}
