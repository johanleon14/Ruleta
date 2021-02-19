/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PaneRuleta extends JPanel {

    int GradosPelota = 0;
    boolean flag = false;
    String numero = "";
    String color = "";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void SubirProgreso(int GradosPelota) {
        this.GradosPelota = GradosPelota;
    }
    int GradosRuleta = 0;

    public void setGrados(int GradosPelota) {
        this.GradosRuleta = GradosPelota;
    }

    @Override

    public void paint(Graphics g) {

        super.paint(g);
        
        try{
////////////////////////////////////////***GIRAR RULETA***///////////////////////////////////////
        File ruta=new File("src\\img\\ruleta.png");
        

        BufferedImage img = LoadImage(ruta.getAbsolutePath());

        AffineTransform at = AffineTransform.getTranslateInstance(10, 0);

        at.rotate(Math.toRadians(GradosRuleta), img.getWidth() / 2, img.getHeight() / 2);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, at, null);

        repaint();

        ///////////////////////////////////////***GIRAR PELOTA***///////////////////////////////////////  
        File ruta2=new File("src\\img\\pelota2.png");
        BufferedImage img2 = LoadImage(ruta2.getAbsolutePath());
        AffineTransform at2 = AffineTransform.getTranslateInstance(10, 0);
        at2.rotate(Math.toRadians(GradosPelota * 3.6), img.getWidth() / 2, img.getHeight() / 2);
        Graphics2D g3d = (Graphics2D) g;
        g3d.drawImage(img2, at2, null);
        repaint();

        ///////////////////////////**GIRAR CON UNA LINEA////////////////////////
        /*
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(this.getWidth() / 2, this.getHeight() / 2); //TRANSLADA LA RECTA AL CENTRO DEL PANE
        g2.rotate(Math.toRadians(270)); //rota la recta
        Arc2D.Float arco = new Arc2D.Float(Arc2D.PIE);

        arco.setFrameFromCenter(new Point(0, 0), new Point(150, 150));// PRIMER PUNTO ES EL CENTRO Y EL SEGUNDO PUNTO ES EL 
        //EXTREMO DE LA RECTA
        arco.setAngleStart(-progreso * 3.6);

        g2.setColor(Color.red); //COLOR DE LA LINEA
        g2.draw(arco);
        g2.fill(arco);
            
        g.setFont(new Font("verdana", Font.PLAIN, 10));
         */
        
        if (this.flag == true && this.getColor().equals("negro")&& Integer.parseInt(this.getNumero())!=0) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.translate(this.getWidth() / 2, this.getHeight() / 2);
            Ellipse2D circulo = new Ellipse2D.Float(0, 0, 20, 20);
            circulo.setFrameFromCenter(new Point(0, 0), new Point(40, 40));///TAMAÑO DEL CIRCULO
            g2.setColor(Color.BLACK);////FONDO DEL CIRCULO
            g2.draw(circulo);
            g2.fill(circulo);
            g2.setColor(Color.WHITE);////COLOR DEL FONT PARA EL NUMERO GANADOR
            g.setFont(new Font("verdana", Font.PLAIN, 50));////TAMAÑO Y TIPO DE LETRA
            FontMetrics fm = g2.getFontMetrics();
            Rectangle2D r = fm.getStringBounds(this.GradosRuleta + "%", g);

            if (Integer.parseInt(this.getNumero()) < 10) {//centro para numeros menores de 10
                int x = (0 - (int) r.getWidth()) / 2 + 76;
                int y = (0 - (int) r.getHeight()) / 2 + fm.getAscent() - 2;
                g2.drawString(this.getNumero(), x, y);
            } else {//centro para numeros mayores de 10
                int x = (0 - (int) r.getWidth()) / 2 + 60;
                int y = (0 - (int) r.getHeight()) / 2 + fm.getAscent() - 2;
                g2.drawString(this.getNumero(), x, y);
            }

        }

        if (this.flag == true && this.getColor().equals("rojo")&& Integer.parseInt(this.getNumero())!=0) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.translate(this.getWidth() / 2, this.getHeight() / 2);
            Ellipse2D circulo = new Ellipse2D.Float(0, 0, 20, 20);
            circulo.setFrameFromCenter(new Point(0, 0), new Point(40, 40));///TAMAÑO DEL CIRCULO
            g2.setColor(Color.RED);////FONDO DEL CIRCULO
            g2.draw(circulo);
            g2.fill(circulo);
            g2.setColor(Color.WHITE);////COLOR DEL FONT PARA EL NUMERO GANADOR
            g.setFont(new Font("verdana", Font.PLAIN, 50));////TAMAÑO Y TIPO DE LETRA
            FontMetrics fm = g2.getFontMetrics();
            Rectangle2D r = fm.getStringBounds(this.GradosRuleta + "%", g);

            if (Integer.parseInt(this.getNumero()) < 10 ) {//centro para numeros menores de 10
                int x = (0 - (int) r.getWidth()) / 2 + 76;
                int y = (0 - (int) r.getHeight()) / 2 + fm.getAscent() - 2;
                g2.drawString(this.getNumero(), x, y);
            } else {//centro para numeros mayores de 10
                int x = (0 - (int) r.getWidth()) / 2 + 60;
                int y = (0 - (int) r.getHeight()) / 2 + fm.getAscent() - 2;
                g2.drawString(this.getNumero(), x, y);
            }
        }

        if (this.flag == true && Integer.parseInt(this.getNumero()) == 0) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.translate(this.getWidth() / 2, this.getHeight() / 2);
            Ellipse2D circulo = new Ellipse2D.Float(0, 0, 20, 20);
            circulo.setFrameFromCenter(new Point(0, 0), new Point(40, 40));///TAMAÑO DEL CIRCULO
            g2.setColor(Color.GREEN);////FONDO DEL CIRCULO
            g2.draw(circulo);
            g2.fill(circulo);
            g2.setColor(Color.BLACK);////COLOR DEL FONT PARA EL NUMERO GANADOR
            g.setFont(new Font("verdana", Font.PLAIN, 50));////TAMAÑO Y TIPO DE LETRA
            FontMetrics fm = g2.getFontMetrics();
            Rectangle2D r = fm.getStringBounds(this.GradosRuleta + "%", g);

            int x = (0 - (int) r.getWidth()) / 2 + 76;
            int y = (0 - (int) r.getHeight()) / 2 + fm.getAscent() - 2;
            g2.drawString(this.getNumero(), x, y);

        }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    BufferedImage LoadImage(String FileName) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(FileName));
        } catch (IOException e) {
            System.out.println(e);
        }
        return img;
    }

}
