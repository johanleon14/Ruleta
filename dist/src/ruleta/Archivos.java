/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Archivos {

    ///////////////////////////CREA LOS ARCHIVOS/////////////////////////////
    public void CrearArchivo(String Nombre) {
        File ruta = new File("src\\ArchivosClientes");
        File file = new File(ruta.getAbsolutePath(), Nombre.concat(".txt"));

        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    //////////////////////////BORRAR LOS ARCHIVOS///////////////////////////////
    public void BorrarArchivo(String Nombre) {
        File ruta = new File("src\\ArchivosClientes");
        File file = new File(ruta.getAbsolutePath(), Nombre.concat(".txt"));
        if (file.exists()) {
            try {
                file.delete();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    ////////////////////////////PERMITE LEER LOS ARCHIVOS/////////////////////////7
    public void LeerFichero(int id) throws FileNotFoundException, IOException {
        File ruta = new File("C:\\Users\\User\\Desktop\\RuletaProyecto\\Ruleta\\src\\ArchivosClientes\\" + id + ".txt");
        Ruleta r = new Ruleta();
        if (ruta.exists()) {
            FileReader fr = new FileReader(ruta);
            BufferedReader bf = new BufferedReader(fr);

            String temp = "";
            String texto;
            while ((texto = bf.readLine()) != null) {

                String Separar[] = texto.split("-");
                System.out.println("NOMBRE: " + Separar[0] + " DINERO TOTAL: " + Separar[1] + " id: " + id);
                
                r.agregarAlFinal(id,Separar[0],Integer.parseInt(Separar[1]));
               

            }
            texto = temp;
            System.out.println(texto);

        }
    }

    /////////////////////PERMITE ESCRIBIR EN UN ARCHIVO//////////////////////////
    public void EscribirFichero(String Nombre, String dinerototal) {
        File ruta = new File("C:\\Users\\User\\Desktop\\RuletaProyecto\\Ruleta\\src\\ArchivosClientes");
        File file = new File(ruta, Nombre.concat(".txt"));

        try {
            if (file.exists()) {
               
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                //bw.write(String.valueOf(dinerototal));
                pw.write(Nombre + "-" + dinerototal);

                pw.close();
                bw.close();

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
