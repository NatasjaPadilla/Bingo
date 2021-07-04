/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingopackage;

import java.util.Random;

/**
 *
 * @author nat
 * 
 * this class generates the bingo cards
 */
public class bingomanager {
    
    public int generate = 0;
    
    public void generateBingo(int cardnumber){
        Random r = new Random();
        int[][][] number = new int[generate][5][5]; 
        
        for(int k = 0; k < number.length; k = cardnumber){
            System.out.println("B\tI\tN\tG\tO");
            for(int i = 0; i < number[k].length; i++){
                for(int j = 0; j < number[k][i].length; j++){
                    number[k][i][j] = r.nextInt(15) + 1 + (15 * j);
                    number[k][2][2] = 0;
                    System.out.print(number[k][i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
