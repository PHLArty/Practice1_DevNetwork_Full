/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyuser;

/**
 *
 * @author Arty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLUser ql = new QLUser();
        
        frmMain obj = new frmMain(ql);
        obj.setVisible(true);
    }
    
}
