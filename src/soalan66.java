/*Anda dikehendaki membina satu aturcara yang dapat 
 *menukarkan nilai tahun kepada bentuk taun kalendar cina
 *Contohya tahun 2017 adalah taun ayam.
 *Dengan menggunakan struktur kawalan switch-case
 *bina atur cara tersebut

 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class soalan66 {
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Taipkan tahun: ");
    
int year = input.nextInt();
switch (year % 12){
    
    case 0 : System.out.println("monyet"); break;
    case 1 : System.out.println("ayam"); break;
    case 2 : System.out.println("anjing"); break;
    case 3 : System.out.println("babi"); break;
    case 4 : System.out.println("tikus"); break;
    case 5 : System.out.println("lembu"); break;
    case 6 : System.out.println("harimau"); break;
    case 7 : System.out.println("arnab"); break;
    case 8 : System.out.println("naga"); break;
    case 9 : System.out.println("ular"); break;
    case 10 : System.out.println("kuda"); break;
    case 11 : System.out.println("kambing"); break;
    
}
}
    
}
