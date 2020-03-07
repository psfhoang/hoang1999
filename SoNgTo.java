/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songto;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class SoNgTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so");
        int a =sc.nextInt();
        int dem=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                dem++;
            }
        }
        if(dem==0)
        {
            System.out.println("so do la so nguyen to");
        }
        // TODO code application logic here
    }
    
}
