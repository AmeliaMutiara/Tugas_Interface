/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInterface3;

import TugasInterface2.Superhero;

/**
 *
 * @author zyrex
 */
public class UjiBank extends Bank {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.menabung();
        obj.transfer();
        obj.menarik();
    }
}
