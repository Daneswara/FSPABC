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

    static int colonySize = 1;
    static int maksIterasi = 1;
    static int sizeProblem = 4;
    static int limit = 5;
    static int nse = 2 * sizeProblem;
    static int project = 4;
    /**
     * @param args the command line arguments
     */
    static int[][] data = new int[project][sizeProblem];

    public static void main(String[] args) {
        // TODO code application logic here     

        data[0][0] = 5;
        data[0][1] = 5;
        data[0][2] = 2;
        data[0][3] = 3;

        data[1][0] = 5;
        data[1][1] = 4;
        data[1][2] = 2;
        data[1][3] = 4;
        data[2][0] = 3;
        data[2][1] = 4;
        data[2][2] = 2;
        data[2][3] = 2;
        data[3][0] = 5;
        data[3][1] = 2;
        data[3][2] = 1;
        data[3][3] = 1;

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
        for (int i = 0; i < colonySize; i++) {
            ArrayList<Integer> random = new ArrayList<Integer>();
            for (int r = 1; r < 5; r++) {
                random.add(new Integer(r));
            }
            Collections.shuffle(random);
            for (int j = 0; j < sizeProblem; j++) {
                initbee[i][j] = (int) random.get(j);
                System.out.print(initbee[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
            hitungMakeSpan(initbee[i]);
        }

    }

    static int[] task = {0, 0, 0, 0};

    public static void hitungMakeSpan(int[] urutan) {
        for (int i = 0; i < urutan.length; i++) {
            System.out.println("Urutan Operasi " + urutan[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.println(data[urutan[i] - 1][j]);
                if (j == 0) {
                    task[j] += data[urutan[i] - 1][j];
                } else {
                    if (task[j] > task[j - 1]) {
                        task[j] += data[urutan[i] - 1][j];
                    } else {
                        task[j] = data[urutan[i] - 1][j];
                        task[j] += task[j - 1];
                    }
                }
                System.out.println("task " + task[j]);
            }
        }
    }

}
