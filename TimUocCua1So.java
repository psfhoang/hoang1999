/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timuoccua1so;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class TimUocCua1So {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so");
        int a =sc.nextInt();
        System.out.println("cac uoc cua so do la");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
            
        }
        // TODO code application logic here
    }
    
}
