/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelaucher;

import javax.swing.JOptionPane;

/**
 *
 * @author mykemtende
 */
public class Player {
    
//int number = 0;

String num = JOptionPane.showInputDialog("Enter Number To Guess : ");
int number = Integer.parseInt(num);


public void guess() {

//JOptionPane.showMessageDialog(null,"I'm guessing:  " + number);
while(num.equals("")){
JOptionPane.showMessageDialog(null, "Must Enter a number! ");

}
    
}
}