/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fspabc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author dhimasanjar
 */
public class FSPABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        int colonySize = 3;
        int maksIterasi = 1;
        int sizeProblem = 4;
        int limit = 5;
        int nse = 2 * sizeProblem;
        int project = 4;
        
        int[][] data = new int[project][sizeProblem];
        data[0][0] = 5; data[0][1] = 5; data[0][2] = 2; data[0][3] = 3;
        data[1][0] = 5; data[1][1] = 4; data[1][2] = 2; data[1][3] = 4;
        data[2][0] = 3; data[2][1] = 4; data[2][2] = 2; data[2][3] = 2;
        data[3][0] = 5; data[3][1] = 2; data[3][2] = 1; data[3][3] = 1;
        
//        System.out.println("Data :");
//        for (int i = 0; i < data.length; i++){
//            for (int j = 0; j < data[i].length; j++){
//                System.out.print(data[i][j]); System.out.print(" ");
//            }
//            System.out.println("");
//        }
        
//        int max = 4; int min = 1;
//        Random random = new Random();
//        int terpilih1 = random.nextInt(max - min + 1) + min;
//        System.out.println(terpilih1);
        
        int[][] initbee = new int[colonySize][sizeProblem];
        System.out.println("[Employeed bee] Inisialisasi bee :");
        for (int i = 0; i < colonySize; i++){
            ArrayList<Integer> random = new ArrayList<Integer>();
            for (int r = 1; r < 5; r++) {
                random.add(new Integer(r));
            }
            Collections.shuffle(random);
            for (int j = 0; j < sizeProblem; j++){
                initbee[i][j] = (int) random.get(j);
                System.out.print(initbee[i][j]); System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
