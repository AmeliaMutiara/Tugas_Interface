/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInterface3;

/**
 *
 * @author zyrex
 */
public class Bank implements Operasi{
    public void menabung(){
        System.out.println("Menabung");
    }
    public void transfer() {
        System.out.println("Transfer");
    }
    public void menarik() {
        System.out.println("Menarik");
    }
}
