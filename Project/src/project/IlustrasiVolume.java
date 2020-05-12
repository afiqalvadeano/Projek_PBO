/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



import java.awt.*;
import java.applet.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JPanel;

public class IlustrasiVolume extends Applet {

    Dimension screen;
    Random random = new Random();

    public void init() {
        // set size frame base on your resolution screen 
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width, screen.height);
        setBackground(Color.decode("#1f2256"));

    }

    public void paint(Graphics g) {
        int max = 900;
        int min = 100;
        int range = (max - min) + 1;
        int volume[] = getIsiVolume();
        int panjang[] = getIsiPanjangLintasan();
        // Matahari
        g.setColor(Color.decode("#ffe712"));
        g.fillOval(-400, 200, 550, 500);
        g.setColor(Color.decode("#fffbd5"));
        g.drawOval(-400, 200, 551, 501);

        String[][] planet = {
            {"#dcdcdc", "#f9932d", "#00bfff", "#cdaa7d", "#fd9730", "#fbf344", "#8bf0f9", "#54c0cc"}, //[0] isi dalam
            {"#cfcfcf","#f88614","#00bfff","#c69e6b","#fbcfa3","#f9f495","#c5f4f9","#71cad4"}, //[1] tepi tepi
            {"Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"}, //[3]  Nama Planet 
//            {"250", "325", "400", "475", "550", "800", "1000", "1300"}, //[4] x 
            {"350", "550", "500", "600", "450", "600", "450", "350"} //[5] y 
        };

        // looping for draw planet
        for (int p = 0; p < planet[0].length; p++) {
            String fillC = planet[0][p];
            String drawC = planet[1][p];
            int size = volume[p];
            int sizeOut = volume[p] + 1;
            String pName = planet[2][p];
            int x = panjang[p];
            int y = Integer.parseInt(planet[3][p]);
            int yText = y + sizeOut + 15;

            g.setColor(Color.decode(fillC));
            g.fillOval(x, y, size, size);
            g.setColor(Color.decode(drawC));
            g.drawOval(x, y, sizeOut, sizeOut);
            g.drawString(pName, x, yText);
            if (p == 5) {
                g.setColor(Color.white);
                g.drawArc((x - 5), (y + 35), 170, 50, 170, 170);
                g.setColor(Color.white);
                g.drawArc((x - 10), (y + 40), 170, 50, 170, 170);
                g.setColor(Color.white);
                g.drawArc((x - 15), (y + 45), 170, 50, 170, 170);
            }
            if (p == 7) {
                g.setColor(Color.white);
                g.drawArc((x - 5), (y + 35), 170, 50, 170, 170);
            }
        }
        
         // looping for draw litle star with random position and random color
        for(int oval=0; oval<=5000;oval++){
            random = new Random();
            int y = random.nextInt((screen.height+1000));
            int x = random.nextInt((screen.width+1000));
            float xr = random.nextFloat();
            float xg = random.nextFloat();
            float xb = random.nextFloat();
            if(oval%2 == 1){
                int w = random.nextInt(7);
                int h = random.nextInt(7);
                g.setColor(new Color(xr, xg, xb));
                g.drawOval(y, x, h, h); //ganjil is draw
            } else {
                random = new Random();
                int w = random.nextInt(5);
                int h = random.nextInt(5);
                g.setColor(new Color(xr, xg, xb));
                g.fillOval(y, x, h, h); //ganjil is draw
            }
        }

    }

    static int[] getIsiVolume() {
        int jumlah = 0;
        int volume[] = new int[8];
        volume[0] = (int) Merkurius.vMerkurius;
        volume[1] = (int) Venus.vVenus;
        volume[2] = (int) Bumi.vBumi;
        volume[3] = (int) Mars.vMars;
        volume[4] = (int) Jupiter.vJupiter;
        volume[5] = (int) Saturnus.vSaturnus;
        volume[6] = (int) Uranus.vUranus;
        volume[7] = (int) Neptunus.vNeptunus;
        return volume;
    }
    
    static int[] getIsiPanjangLintasan() {
        int jumlah = 0 ; 
        int panjang[] = new int[8];
        panjang[0] = (int) Merkurius.pRevolusi;
        panjang[1] = (int) Venus.pRevolusi;
        panjang[2] = (int) Bumi.pRevolusi;
        panjang[3] = (int) Mars.pRevolusi;
        panjang[4] = (int) Jupiter.pRevolusi;
        panjang[5] = (int) Saturnus.pRevolusi;
        panjang[6] = (int) Uranus.pRevolusi;
        panjang[7] = (int) Neptunus.pRevolusi;
        return panjang ;
    }
    
    
    
}


   




   


