package project;



import java.awt.*;
import java.applet.*;
import java.util.Random;

public class IlustrasiVolume2 extends Applet {

    Dimension screen;
    Random random = new Random();

    public void init() {
       
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width, screen.height);
        setBackground(Color.decode("#1f2256"));

    }

    public void paint(Graphics g) {
        int max = 900;
        int min = 100;
        int range = (max - min) + 1;

        
        g.setColor(Color.decode("#ffe712"));
        g.fillOval(-400, 200, 550, 500);
        g.setColor(Color.decode("#fffbd5"));
        g.drawOval(-400, 200, 551, 501);

        String[][] planet = {
            {"#dcdcdc", "#f9932d", "#00bfff", "#cdaa7d", "#fd9730", "#fbf344", "#8bf0f9", "#54c0cc"}, 
            {"#cfcfcf", "#f88614", "#00bfff", "#c69e6b", "#fbcfa3", "#f9f495", "#c5f4f9", "#71cad4"},
            {"35", "45", "40", "50", "160", "120", "110", "100"}, 
            {"Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"}, 
            {"250", "325", "400", "475", "550", "800", "1000", "1300"}, 
            {"350", "550", "500", "600", "450", "600", "450", "350"} 
        };

       
        for (int p = 0; p < planet[0].length; p++) {
            String fillC = planet[0][p];
            String drawC = planet[1][p];
            int size = Integer.parseInt(planet[2][p]);
            int sizeOut = Integer.parseInt(planet[2][p]) + 1;
            String pName = planet[3][p];
            int x = Integer.parseInt(planet[4][p]);
            int y = Integer.parseInt(planet[5][p]);
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
                g.drawOval(y, x, h, h); 
            } else {
                random = new Random();
                int w = random.nextInt(5);
                int h = random.nextInt(5);
                g.setColor(new Color(xr, xg, xb));
                g.fillOval(y, x, h, h); 
            }
        }

    }
}