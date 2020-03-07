/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsolonvasobe;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class TimSoLonVaSoBe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []a= new int[10];
        
        for(int i=0;i<10;i++)
        {
           System.out.println("nhap vao so thu "+(i+1));
           a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0];
        for(int i=1;i<10;i++)
        {
            if(max>=a[i])
            {
                max=a[i];
            }
            if(min<=a[i])
            {
                min=a[i];
            }
        }
        System.out.println("so lon nhat la"+max);
        System.out.println("so nho nhat la"+min);
                
        
        
        // TODO code application logic here
    }
    
}
