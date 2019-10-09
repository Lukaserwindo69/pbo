/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author KANG_SNAKE
 */
public class Sepedamotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sepedamotor motor = new Sepedamotor();
        motor.setMerk("");
        motor.setNama("");
    }
    private void setMerk(String Merk) {
        Merk = "honda";
        System.out.println("MERK MOTOR ADALAH : "+Merk);
        
    }
    private void setNama(String Nama) {
        Nama = "Beat";
        System.out.println("Nama motor adalah : "+Nama);
    }
}
