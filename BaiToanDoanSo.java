/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoandoanso;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class BaiToanDoanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int b=50;
        for(int i=0;i<100;i++)
        {
            System.out.println("moi ban doan");
            int a=sc.nextInt();
            if(a<b)
            {
                System.out.println("ban doan so nho hon");
            }
            if(a>b)
            {
                System.out.println("ban doan so lon hon");
            }
            if(a==b)
            {
                System.out.println("ban da doan dung");
                 break;
            }
        }
        
      
    }
    
}
