/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayisiralama;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class SayiSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.print("1.sayiyi giriniz:");
        int a=input.nextInt();
        
        System.out.print("2.sayiyi giriniz:");
        int b=input.nextInt();
        
        System.out.print("3.sayiyi giriniz:");
        int c=input.nextInt();
        
        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        }
        
        if((b<a)&&(b<c)){
            if(a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        }
        
        if((c<b)&&(c<a)){
            if(a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }
        
    }
    
}
