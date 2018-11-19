/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Achmad Eko & Nezia
 */

public class Konversi {

    /**
     * @param args the command line arguments
     */
    
    static int des;
    static String bin;
    static String hex;
    
    //Input nilai
    public static int inputDes(){
        System.out.print("Desimal : ");
        Scanner inputan = new Scanner(System.in);
        des = inputan.nextInt();
        return des;
    }
    
    public static String inputBin(){
        System.out.print("Binary : ");
        Scanner inputan = new Scanner(System.in);
        bin = inputan.nextLine();
        return bin;
    }
    
    //Konversi Desimal ke Biner
    public static void biner(int n){
        String y;
        if(n>1){
            biner(n/2);
        }
        y = Integer.toString(n%2);
        System.out.print(y);
        //for(int x = 0; x > )
        //return y;
    }
    
    //Konversi Desimal ke Oktal
    public static void oktal(int n){
        if(n>1){
            oktal(n/8);
        }
        System.out.print(n%8);
    }
    
    //Konversi Desimal ke Hexa
    public static void hexa(int n){
        char[] nilaiHexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(n>1){
            hexa(n/16);
        }
        System.out.print(nilaiHexa[n%16]);
    }
    
    //Konversi Biner ke Desimal
    public static int binDes(String n){
        int x, y = 0;
        for(x = 0; x < n.length();x++){
            if(n.charAt(x) == '1'){
                y += Math.pow(2,(n.length()-1)-x);
            }
            else
                y += 0;
        }
        return y;
        //System.out.print(y);
    }
    
    //Konversi Biner ke Oktal
    public static void binOktal(String n){
        int y = 0;
        y = binDes(bin);
        
        if(y>1){
            oktal(y/8);
        }
        System.out.print(y%8);
    }
    
    //Konversi Biner ke Hexa
    public static void binHex(String n){
        int y = 0;
        y = binDes(bin);
        char[] nilaiHexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(y>1){
            hexa(y/16);
        }
        System.out.print(nilaiHexa[y%16]);
    }
    
    //Menampilkan konversi dari desimal
    public static void tmpDes(){
        inputDes();
        //System.out.print("Binernya adalah : " + biner(des));
        System.out.print("Binernya adalah : ");
        biner(des);
        System.out.println("");
        System.out.print("Oktalnya adalah : ");
        oktal(des);
        System.out.println("");
        System.out.print("Heksanya adalah : ");
        hexa(des);
        System.out.println("");
    }
    
    //Menampilkan konversi dari biner
    public static void tmpBin(){
        inputBin();
        System.out.print("Desimalnya adalah : " + binDes(bin));
        //binDes(bin);
        System.out.println("");
        System.out.print("Oktalnya adalah : ");
        binOktal(bin);
        System.out.println("");
        System.out.print("Heksanya adalah : ");
        binHex(bin);
    }
    
    public static void main(String[] args) {
        do{ 
        System.out.println("");
        tmpDes();
        tmpBin();
        }while(true);
//         String n = "101011";
//         int x, y = 0;
//        for(x = 0; x < n.length();x++){
//            if(n.charAt(x) == '1'){
//                y += Math.pow(2,(n.length()-1)-x);
//            }
//            else
//                y += 0;
//        }
//        System.out.println(y);
//        char[] nilaiHexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        if(y>1){
//            hexa(y/16);
//        }
//        System.out.print(nilaiHexa[y%16]);
    }
}
