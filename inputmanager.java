/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingopackage;

import java.util.Scanner;

/**
 *
 * @author nat
 * 
 * this class gets the input
 */
public class inputmanager {
    
    private Scanner sc = new Scanner(System.in);
    private String in = "";
    private int num = 0;
    
    public void userinput(){
        in = sc.nextLine();
    }
    
    public boolean convertint(){
        boolean convert = false;
        
        try{
            num = Integer.parseInt(in);
            convert = true;
        }
        catch(Exception e){
            System.out.println("not a number");
        }
        return convert;
    }
    
    public int getnumber(){
        return num;
    }
    
}
