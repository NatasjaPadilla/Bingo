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
 * this is the main class
 */
public class mainbingo {
    
    private static inputmanager im = new inputmanager();
    private static bingomanager bm = new bingomanager();
    private static outputmanager om = new outputmanager();
    
    public static void main(String[] args){
        om.print("how many cards would you like to generate?: ");
        im.userinput();
        
        if(im.convertint()){
            bm.generate = im.getnumber();
            //bm.generateBingo();
            om.print("bingo card generation successful");
            questions();
        }
    }
    
    public static void questions(){
        Scanner sc = new Scanner(System.in);
        om.print("input card number you wish to view: ");
        im.userinput();
        //bm.printBingo(im.getnumber());
        bm.generateBingo(im.getnumber());
            
        for(int x = 0; x < im.getnumber()-1; x++){
            om.print("view more? (Y/N): ");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("Y")){
                om.print("input card number you wish to view: ");
                im.userinput();
                bm.generateBingo(im.getnumber());
                //om.print("this is working");
            }
            else{
                //om.print("ok");
                break;
            }
        }
    }
}
