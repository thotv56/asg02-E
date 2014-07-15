/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testdemo;

/**
 *
 * @author GRU-PC
 */
public class TestDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test t = new Test("101");
        Test t1 = new Test(3);
        System.out.println(t1.toString());
        System.out.println(t1.toLong());
        Test t3 = new Test(3,3);
        System.out.println(t3.equals());
        System.out.println(t3.compareTo());
        System.out.println(t3.getAdd());
        System.out.println(t3.getSubtract());
    }
    
}
