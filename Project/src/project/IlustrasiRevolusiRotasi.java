
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class IlustrasiRevolusiRotasi extends javax.swing.JFrame implements Runnable{
     boolean kanan1 = true,kanan2 = false,kanan3 = true,kanan4 = true,kanan5 = true,kanan6 = true,kanan7 = true,kanan8 = true;
     boolean kiri1 = false, kiri2 = true,kiri3 = false,kiri4 = false,kiri5 = false,kiri6 = false,kiri7 = false,kiri8 = false;
     boolean berjalan = true;
     int x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8;
     Thread T;
     String a1,b1,c1,a2,b2,c2,a3,b3,c3,a4,b4,c4,a5,b5,c5,a6,b6,c6,a7,b7,c7,a8,b8,c8;
     
     int putaran1 =0,putaran2 =0,putaran3 =0,putaran4 =0,putaran5 =0,putaran6 =0,putaran7 =0,putaran8 =0;
     int rev1=0,rev2=0,rev3=0,rev4=0,rev5=0,rev6=0,rev7=0,rev8=0;  
     
     int putrot1=0,putrot2=0,putrot3=0,putrot4=0,putrot5=0,putrot6=0,putrot7=0,putrot8=0;
     int rot1=0,rot2=0,rot3=0,rot4=0,rot5=0,rot6=0,rot7=0,rot8=0;
             
     String jmlhRev1,jmlhRev2,jmlhRev3,jmlhRev4,jmlhRev5,jmlhRev6,jmlhRev7,jmlhRev8;
     String jmlhRot1,jmlhRot2,jmlhRot3,jmlhRot4,jmlhRot5,jmlhRot6,jmlhRot7,jmlhRot8;
    /**
     * Creates new form IlustrasiRevolusiRotas
     */
    public IlustrasiRevolusiRotasi() {
        initComponents();

    /**
     * Creates new form IlustrasiPergerakan
     */
        setBackground(Color.yellow);
        this.setTitle("Selamat Datang");
        this.setLocationRelativeTo(this);
        x1 = lMerkurius.getX(); x2 = lVenus.getX(); x3 = lBumi.getX(); x4 = lMars.getX(); x5 = lJupiter.getX(); x6 = lSaturnus.getX(); x7 = lUranus.getX(); x8 = lNeptunus.getX();
        y1 = lMerkurius.getY(); y1 = lVenus.getY(); y1 = lBumi.getY(); y1 = lMars.getY(); y1 = lJupiter.getY(); y1 = lSaturnus.getY(); y1 = lUranus.getY(); y1 = lNeptunus.getY();
        
        T = new Thread(this);
        T.start();
            
    }
    
    @Override
    public void run() {
                ActionListener acl1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1 = lMerkurius.getText();
                if (a1.substring(a1.length()-1,a1.length()).compareTo("*") == 0) {
                    rot1++ ; 
                    if(rot1 == 2) {
                        rot1=0;
                        putrot1++;
                        jmlhRot1 = Integer.toString(putrot1);
                        rotMerkurius.setText(jmlhRot1);
                    }
                }
                b1 = a1.substring(0,a1.length()-1);
                c1= a1.substring(a1.length()-1,a1.length());
                lMerkurius.setText(c1+b1);
            }
        };new javax.swing.Timer(700,acl1).start();
        
        ActionListener acl2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a2 = lVenus.getText();
                if (a2.substring(0,1).compareTo("*") == 0) {
                    rot2++ ; 
                    if(rot2 == 2) {
                        rot2=0;
                        putrot2++;
                        jmlhRot2 = Integer.toString(putrot2);
                        rotVenus.setText(jmlhRot2);
                    }
                }
                b2 = a2.substring(0,1);
                c2= a2.substring(1,a2.length());
                lVenus.setText(c2+b2);
            }
        };new javax.swing.Timer(800,acl2).start();
        
        ActionListener acl3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a3 = lBumi.getText();
                if (a3.substring(a3.length()-1,a3.length()).compareTo("*") == 0) {
                    rot3++ ; 
                    if(rot3 == 2) {
                        rot3=0;
                        putrot3++;
                        jmlhRot3 = Integer.toString(putrot3);
                        rotBumi.setText(jmlhRot3);
                    }
                }
                b3 = a3.substring(0,a3.length()-1);
                c3= a3.substring(a3.length()-1,a3.length());
                lBumi.setText(c3+b3);
            }
        };new javax.swing.Timer(500,acl3).start();
        
        ActionListener acl4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a4 = lMars.getText();
                if (a4.substring(a4.length()-1,a4.length()).compareTo("*") == 0) {
                    rot4++ ; 
                    if(rot4 == 2) {
                        rot4=0;
                        putrot4++;
                        jmlhRot4 = Integer.toString(putrot4);
                        rotMars.setText(jmlhRot4);
                    }
                }
                b4 = a4.substring(0,a4.length()-1);
                c4= a4.substring(a4.length()-1,a4.length());
                lMars.setText(c4+b4);
            }
        };new javax.swing.Timer(600,acl4).start();
        
        ActionListener acl5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a5 = lJupiter.getText();
                if (a5.substring(a5.length()-1,a5.length()).compareTo("*") == 0) {
                    rot5++ ; 
                    if(rot5 == 2) {
                        rot5=0;
                        putrot5++;
                        jmlhRot5 = Integer.toString(putrot5);
                        rotJupiter.setText(jmlhRot5);
                    }
                }
                b5 = a5.substring(0,a5.length()-1);
                c5= a5.substring(a5.length()-1,a5.length());
                lJupiter.setText(c5+b5);
            }
        };new javax.swing.Timer(100,acl5).start();
        
        ActionListener acl6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a6 = lSaturnus.getText();
                if (a6.substring(a6.length()-1,a6.length()).compareTo("*") == 0) {
                    rot6++ ; 
                    if(rot6 == 2) {
                        rot6=0;
                        putrot6++;
                        jmlhRot6 = Integer.toString(putrot6);
                        rotSaturnus.setText(jmlhRot6);
                    }
                }
                b6 = a6.substring(0,a6.length()-1);
                c6= a6.substring(a6.length()-1,a6.length());
                lSaturnus.setText(c6+b6);
            }
        };new javax.swing.Timer(200,acl6).start();
        
        ActionListener acl7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a7 = lUranus.getText();
                if (a7.substring(a7.length()-1,a7.length()).compareTo("*") == 0) {
                    rot7++ ; 
                    if(rot7 == 2) {
                        rot7=0;
                        putrot7++;
                        jmlhRot7 = Integer.toString(putrot7);
                        rotUranus.setText(jmlhRot7);
                    }
                }
                b7 = a7.substring(0,a7.length()-1);
                c7= a7.substring(a7.length()-1,a7.length());
                lUranus.setText(c7+b7);
            }
        };new javax.swing.Timer(300,acl7).start();
        
        ActionListener acl8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a8 = lNeptunus.getText();
                if (a8.substring(a8.length()-1,a8.length()).compareTo("*") == 0) {
                    rot8++ ; 
                    if(rot8 == 2) {
                        rot8=0;
                        putrot8++;
                        jmlhRot8 = Integer.toString(putrot8);
                        rotNeptunus.setText(jmlhRot8);
                    }
                }
                b8 = a8.substring(0,a8.length()-1);
                c8= a8.substring(a8.length()-1,a8.length());
                lNeptunus.setText(c8+b8);
            }
        };new javax.swing.Timer(400,acl8).start();
        
        
        while (true) {
            if (berjalan) {
                 if (x1>=pMerkurius.getWidth() - 40) {
                     rev1++; 
                    if (rev1 == 2 ){ 
                        rev1=0;
                        putaran1++;
                        jmlhRev1 = Integer.toString(putaran1);
                        revMerkurius.setText(jmlhRev1);}
                    x1 = 1;
                }
                if (x2>=pVenus.getWidth() - 40) {   }
                if (x3>=pBumi.getWidth() - 40) { 
                    rev3++; 
                    if (rev3 == 2 ){ 
                        rev3=0;
                        putaran3++;
                        jmlhRev3 = Integer.toString(putaran3);
                        revBumi.setText(jmlhRev3);}
                    x3=1;
                }
                if (x4>=pMars.getWidth() - 40) { 
                  rev4++; 
                    if (rev4 == 2 ){ 
                        rev4=0;
                        putaran4++;
                        jmlhRev4 = Integer.toString(putaran4);
                        revMars.setText(jmlhRev4);}
                    x4=1;
                }
                if (x5>=pJupiter.getWidth() - 40) { 
                    rev5++; 
                    if (rev5 == 2 ){ 
                        rev5=0;
                        putaran5++;
                        jmlhRev5 = Integer.toString(putaran5);
                        revJupiter.setText(jmlhRev5);}
                    x5=1;
                }
                if (x6>=pSaturnus.getWidth() - 40) { 
                    rev6++; 
                    if (rev6 == 2 ){ 
                        rev6=0;
                        putaran6++;
                        jmlhRev6 = Integer.toString(putaran6);
                        revSaturnus.setText(jmlhRev6);}
                    x6=1 ;
                }
                if (x7>=pUranus.getWidth() - 40) { 
                 rev7++; 
                    if (rev7 == 2 ){ 
                        rev7=0;
                        putaran7++;
                        jmlhRev7 = Integer.toString(putaran7);
                        revUranus.setText(jmlhRev7);}
                    x7=1;
                }
                if (x8>=pNeptunus.getWidth() - 40) { 
                 rev8++; 
                    if (rev8 == 2 ){
                        rev8 = 0;
                        putaran8++;
                        jmlhRev8 = Integer.toString(putaran8);
                        revNeptunus.setText(jmlhRev8);}
                    x8=1;
                }

                if (kiri1) {x1=x1-8; lMerkurius.setLocation(x1, y1); }
                if (kiri2) {x2=x2-7; lVenus.setLocation(x2, y2); }
                if (kiri3) {x3=x3-6; lBumi.setLocation(x3, y3); }
                if (kiri4) {x4=x4-5; lMars.setLocation(x4, y4); }
                if (kiri5) {x5=x5-4; lJupiter.setLocation(x5, y5); }
                if (kiri6) {x6=x6-3; lSaturnus.setLocation(x6, y6); }
                if (kiri7) {x7=x7-2; lUranus.setLocation(x7, y7); }
                if (kiri8) {x8--; lNeptunus.setLocation(x8, y8); }
                
                if (x1<=0) {     }
                if (x2<=0) {
                    rev2++; 
                    if (rev2 == 2 ){ 
                        rev2=0;
                        putaran2++;
                        jmlhRev2 = Integer.toString(putaran2);
                        revVenus.setText(jmlhRev2);}
                    x2=pVenus.getWidth();
                }
                if (x3<=0) {     }
                if (x4<=0) {  }
                if (x5<=0) {  }
                if (x6<=0) { }
                if (x7<=0) {}
                if (x8<=0) { }
                
                if ( kanan1 ) {x1=x1+8; lMerkurius.setLocation(x1,y1);}
                if ( kanan2 ) {x2=x2+7; lVenus.setLocation(x2,y2);}
                if ( kanan3 ) {x3=x3+6; lBumi.setLocation(x3,y3);}
                if ( kanan4 ) {x4=x4+5; lMars.setLocation(x4,y4);}
                if ( kanan5 ) {x5=x5+4; lJupiter.setLocation(x5,y5);}
                if ( kanan6 ) {x6=x6+3; lSaturnus.setLocation(x6,y6);}
                if ( kanan7 ) {x7=x7+2; lUranus.setLocation(x7,y7);}
                if ( kanan8 ) {x8++; lNeptunus.setLocation(x8,y8);}
                
            }
            try{
                Thread.sleep(20);
            }
            catch ( InterruptedException exc){
                Logger.getLogger(IlustrasiRevolusiRotasi.class.getName()).log(Level.SEVERE,null, exc);
            }
            repaint();
        }      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel11 = new javax.swing.JLabel();
        rotVenus = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rotBumi = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rotMars = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rotJupiter = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rotSaturnus = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        mars = new javax.swing.JLabel();
        rotUranus = new javax.swing.JLabel();
        venus = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jupiter = new javax.swing.JLabel();
        rotNeptunus = new javax.swing.JLabel();
        merkurius = new javax.swing.JLabel();
        pJupiter = new javax.swing.JPanel();
        lJupiter = new javax.swing.JLabel();
        bumi = new javax.swing.JLabel();
        pBumi = new javax.swing.JPanel();
        lBumi = new javax.swing.JLabel();
        pSaturnus = new javax.swing.JPanel();
        lSaturnus = new javax.swing.JLabel();
        neptunus = new javax.swing.JLabel();
        pMerkurius = new javax.swing.JPanel();
        lMerkurius = new javax.swing.JLabel();
        pNeptunus = new javax.swing.JPanel();
        lNeptunus = new javax.swing.JLabel();
        pVenus = new javax.swing.JPanel();
        lVenus = new javax.swing.JLabel();
        saturnus = new javax.swing.JLabel();
        uranus = new javax.swing.JLabel();
        pMars = new javax.swing.JPanel();
        lMars = new javax.swing.JLabel();
        pUranus = new javax.swing.JPanel();
        lUranus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        revMerkurius = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        revVenus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        revBumi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        revMars = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        revJupiter = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        revSaturnus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        revUranus = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        revNeptunus = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rotMerkurius = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setForeground(new java.awt.Color(51, 51, 0));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rotasi :");

        rotVenus.setForeground(new java.awt.Color(240, 240, 240));
        rotVenus.setText("0");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rotasi :");

        rotBumi.setForeground(new java.awt.Color(240, 240, 240));
        rotBumi.setText("0");

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Rotasi :");

        rotMars.setForeground(new java.awt.Color(240, 240, 240));
        rotMars.setText("0");

        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Rotasi : ");

        rotJupiter.setForeground(new java.awt.Color(240, 240, 240));
        rotJupiter.setText("0");

        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Rotasi :");

        rotSaturnus.setForeground(new java.awt.Color(240, 240, 240));
        rotSaturnus.setText("0");

        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Rotasi :");

        mars.setForeground(new java.awt.Color(240, 240, 240));
        mars.setText("Mars");

        rotUranus.setForeground(new java.awt.Color(240, 240, 240));
        rotUranus.setText("0");

        venus.setForeground(new java.awt.Color(255, 255, 255));
        venus.setText("Venus");

        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Rotasi :");

        jupiter.setForeground(new java.awt.Color(240, 240, 240));
        jupiter.setText("Jupiter");

        rotNeptunus.setForeground(new java.awt.Color(240, 240, 240));
        rotNeptunus.setText("0");

        merkurius.setBackground(new java.awt.Color(255, 255, 255));
        merkurius.setForeground(new java.awt.Color(255, 255, 255));
        merkurius.setText("Merkurius");

        pJupiter.setBackground(new java.awt.Color(51, 51, 51));

        lJupiter.setForeground(new java.awt.Color(240, 240, 240));
        lJupiter.setText("*----------");

        javax.swing.GroupLayout pJupiterLayout = new javax.swing.GroupLayout(pJupiter);
        pJupiter.setLayout(pJupiterLayout);
        pJupiterLayout.setHorizontalGroup(
            pJupiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJupiterLayout.createSequentialGroup()
                .addComponent(lJupiter)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pJupiterLayout.setVerticalGroup(
            pJupiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJupiterLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lJupiter)
                .addContainerGap())
        );

        bumi.setForeground(new java.awt.Color(240, 240, 240));
        bumi.setText("Bumi");

        pBumi.setBackground(new java.awt.Color(51, 51, 51));
        pBumi.setPreferredSize(new java.awt.Dimension(100, 53));

        lBumi.setForeground(new java.awt.Color(240, 240, 240));
        lBumi.setText("*----------");

        javax.swing.GroupLayout pBumiLayout = new javax.swing.GroupLayout(pBumi);
        pBumi.setLayout(pBumiLayout);
        pBumiLayout.setHorizontalGroup(
            pBumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBumiLayout.createSequentialGroup()
                .addComponent(lBumi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pBumiLayout.setVerticalGroup(
            pBumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBumiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBumi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pSaturnus.setBackground(new java.awt.Color(51, 51, 51));

        lSaturnus.setForeground(new java.awt.Color(240, 240, 240));
        lSaturnus.setText("*----------");

        javax.swing.GroupLayout pSaturnusLayout = new javax.swing.GroupLayout(pSaturnus);
        pSaturnus.setLayout(pSaturnusLayout);
        pSaturnusLayout.setHorizontalGroup(
            pSaturnusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSaturnusLayout.createSequentialGroup()
                .addComponent(lSaturnus)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pSaturnusLayout.setVerticalGroup(
            pSaturnusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSaturnusLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lSaturnus)
                .addContainerGap())
        );

        neptunus.setForeground(new java.awt.Color(240, 240, 240));
        neptunus.setText("Neptunus");

        pMerkurius.setBackground(new java.awt.Color(51, 51, 51));

        lMerkurius.setForeground(new java.awt.Color(240, 240, 240));
        lMerkurius.setText("*----------");

        javax.swing.GroupLayout pMerkuriusLayout = new javax.swing.GroupLayout(pMerkurius);
        pMerkurius.setLayout(pMerkuriusLayout);
        pMerkuriusLayout.setHorizontalGroup(
            pMerkuriusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMerkuriusLayout.createSequentialGroup()
                .addComponent(lMerkurius)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pMerkuriusLayout.setVerticalGroup(
            pMerkuriusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMerkuriusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lMerkurius)
                .addGap(19, 19, 19))
        );

        pNeptunus.setBackground(new java.awt.Color(51, 51, 51));

        lNeptunus.setForeground(new java.awt.Color(240, 240, 240));
        lNeptunus.setText("*----------");

        javax.swing.GroupLayout pNeptunusLayout = new javax.swing.GroupLayout(pNeptunus);
        pNeptunus.setLayout(pNeptunusLayout);
        pNeptunusLayout.setHorizontalGroup(
            pNeptunusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNeptunusLayout.createSequentialGroup()
                .addComponent(lNeptunus)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pNeptunusLayout.setVerticalGroup(
            pNeptunusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNeptunusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNeptunus)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pVenus.setBackground(new java.awt.Color(51, 51, 51));
        pVenus.setPreferredSize(new java.awt.Dimension(1057, 53));

        lVenus.setForeground(new java.awt.Color(240, 240, 240));
        lVenus.setText("---------*");

        javax.swing.GroupLayout pVenusLayout = new javax.swing.GroupLayout(pVenus);
        pVenus.setLayout(pVenusLayout);
        pVenusLayout.setHorizontalGroup(
            pVenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVenusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lVenus))
        );
        pVenusLayout.setVerticalGroup(
            pVenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVenusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lVenus)
                .addContainerGap())
        );

        saturnus.setForeground(new java.awt.Color(240, 240, 240));
        saturnus.setText("Saturnus");

        uranus.setForeground(new java.awt.Color(240, 240, 240));
        uranus.setText("Uranus");

        pMars.setBackground(new java.awt.Color(51, 51, 51));
        pMars.setPreferredSize(new java.awt.Dimension(100, 53));

        lMars.setForeground(new java.awt.Color(240, 240, 240));
        lMars.setText("*----------");

        javax.swing.GroupLayout pMarsLayout = new javax.swing.GroupLayout(pMars);
        pMars.setLayout(pMarsLayout);
        pMarsLayout.setHorizontalGroup(
            pMarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMarsLayout.createSequentialGroup()
                .addComponent(lMars)
                .addGap(0, 1105, Short.MAX_VALUE))
        );
        pMarsLayout.setVerticalGroup(
            pMarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMars)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pUranus.setBackground(new java.awt.Color(51, 51, 51));

        lUranus.setForeground(new java.awt.Color(240, 240, 240));
        lUranus.setText("*----------");

        javax.swing.GroupLayout pUranusLayout = new javax.swing.GroupLayout(pUranus);
        pUranus.setLayout(pUranusLayout);
        pUranusLayout.setHorizontalGroup(
            pUranusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUranusLayout.createSequentialGroup()
                .addComponent(lUranus)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pUranusLayout.setVerticalGroup(
            pUranusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUranusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lUranus)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Revolus :");

        revMerkurius.setForeground(new java.awt.Color(255, 255, 255));
        revMerkurius.setText("0");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Revolusi :");

        revVenus.setForeground(new java.awt.Color(255, 255, 255));
        revVenus.setText("0");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Revolusi :");

        revBumi.setForeground(new java.awt.Color(255, 255, 255));
        revBumi.setText("0");

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Revolusi :");

        revMars.setForeground(new java.awt.Color(240, 240, 240));
        revMars.setText("0");

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Revolusi :");

        revJupiter.setForeground(new java.awt.Color(240, 240, 240));
        revJupiter.setText("0");

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Revolusi :");

        revSaturnus.setForeground(new java.awt.Color(240, 240, 240));
        revSaturnus.setText("0");

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Revolusi :");

        revUranus.setForeground(new java.awt.Color(240, 240, 240));
        revUranus.setText("0");

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Revolusi :");

        revNeptunus.setForeground(new java.awt.Color(240, 240, 240));
        revNeptunus.setText("0");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rotasi :");

        rotMerkurius.setForeground(new java.awt.Color(255, 255, 255));
        rotMerkurius.setText("0");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MATAHARI");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pMars, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                                .addComponent(pJupiter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pBumi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                                .addComponent(pVenus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                                .addComponent(pMerkurius, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(neptunus)
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(revNeptunus)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rotNeptunus))
                                .addComponent(pSaturnus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pUranus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(uranus)
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(revUranus)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rotUranus))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(saturnus)
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(revSaturnus)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rotSaturnus))
                                .addComponent(pNeptunus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(merkurius)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(revMerkurius)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotMerkurius))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(venus)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(revVenus)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotVenus))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(bumi)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(revBumi)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotBumi))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(mars)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(revMars)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotMars))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jupiter)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(revJupiter)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotJupiter))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(544, 544, 544)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(revMerkurius)
                    .addComponent(jLabel9)
                    .addComponent(rotMerkurius)
                    .addComponent(merkurius))
                .addGap(5, 5, 5)
                .addComponent(pMerkurius, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(revVenus)
                    .addComponent(jLabel11)
                    .addComponent(rotVenus)
                    .addComponent(venus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pVenus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(revBumi)
                    .addComponent(jLabel13)
                    .addComponent(rotBumi)
                    .addComponent(bumi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBumi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(revMars)
                    .addComponent(jLabel15)
                    .addComponent(rotMars)
                    .addComponent(mars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMars, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(revJupiter)
                    .addComponent(jLabel17)
                    .addComponent(rotJupiter)
                    .addComponent(jupiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pJupiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saturnus)
                    .addComponent(jLabel6)
                    .addComponent(revSaturnus)
                    .addComponent(jLabel19)
                    .addComponent(rotSaturnus))
                .addGap(4, 4, 4)
                .addComponent(pSaturnus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uranus)
                    .addComponent(jLabel7)
                    .addComponent(revUranus)
                    .addComponent(jLabel21)
                    .addComponent(rotUranus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pUranus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neptunus)
                    .addComponent(jLabel8)
                    .addComponent(revNeptunus)
                    .addComponent(jLabel23)
                    .addComponent(rotNeptunus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNeptunus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IlustrasiRevolusiRotasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IlustrasiRevolusiRotasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IlustrasiRevolusiRotasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IlustrasiRevolusiRotasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IlustrasiRevolusiRotasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bumi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jupiter;
    private javax.swing.JLabel lBumi;
    private javax.swing.JLabel lJupiter;
    private javax.swing.JLabel lMars;
    private javax.swing.JLabel lMerkurius;
    private javax.swing.JLabel lNeptunus;
    private javax.swing.JLabel lSaturnus;
    private javax.swing.JLabel lUranus;
    private javax.swing.JLabel lVenus;
    private javax.swing.JLabel mars;
    private javax.swing.JLabel merkurius;
    private javax.swing.JLabel neptunus;
    private javax.swing.JPanel pBumi;
    private javax.swing.JPanel pJupiter;
    private javax.swing.JPanel pMars;
    private javax.swing.JPanel pMerkurius;
    private javax.swing.JPanel pNeptunus;
    private javax.swing.JPanel pSaturnus;
    private javax.swing.JPanel pUranus;
    private javax.swing.JPanel pVenus;
    private java.awt.Panel panel1;
    private javax.swing.JLabel revBumi;
    private javax.swing.JLabel revJupiter;
    private javax.swing.JLabel revMars;
    private javax.swing.JLabel revMerkurius;
    private javax.swing.JLabel revNeptunus;
    private javax.swing.JLabel revSaturnus;
    private javax.swing.JLabel revUranus;
    private javax.swing.JLabel revVenus;
    private javax.swing.JLabel rotBumi;
    private javax.swing.JLabel rotJupiter;
    private javax.swing.JLabel rotMars;
    private javax.swing.JLabel rotMerkurius;
    private javax.swing.JLabel rotNeptunus;
    private javax.swing.JLabel rotSaturnus;
    private javax.swing.JLabel rotUranus;
    private javax.swing.JLabel rotVenus;
    private javax.swing.JLabel saturnus;
    private javax.swing.JLabel uranus;
    private javax.swing.JLabel venus;
    // End of variables declaration//GEN-END:variables

    
}
