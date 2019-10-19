/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan48kalkulator;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program untuk menghitung operasi kabataku(kali bagi tambah kurang)
 *                        dengan nilai yang telah ditentukan
 */
public class IF110118015Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);

        System.out.println("VALUE 1 = "+kal.getValue1());
        System.out.println("VALUE 2 = "+kal.getValue2());
        kal.setNameProject();
        kal.setNodeProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+kal.add(kal.getValue1(),kal.getValue2()));
        System.out.println("Result Minus is = "+kal.minus(kal.getValue1(),kal.getValue2()));
        System.out.println("Result Multiplication is = "+kal.multiplication(kal.getValue1(),kal.getValue2()));
        System.out.println("Result Division is = "+kal.division(kal.getValue1(),kal.getValue2()));
    }
    
}
