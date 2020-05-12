/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import static java.lang.Math.pow;

/**
 *
 * @author ATANIA
 */
public class Uranus extends Bola implements Runnable {

    protected double kRotasi, kRevolusi;
    protected static double keliling, kecRotasi, kecRevolusi, lUranus, vUranus,pRevolusi;
    Thread thread;
    PenjalananThread pt;

    public Uranus(double radius, double pLintasanRevolusi, double kRotasi, double kRevolusi,PenjalananThread pt ) {
        super.setR(radius);
        this.pRevolusi = pLintasanRevolusi;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);

        kelilingGarisTengahUranus();
        luasPermukaanUranus();
        volumeUranus();
        kecepatanRotasiUranus();
        kecepatanRevolusiUranus();
    }

    private double kelilingGarisTengahUranus() {
       keliling = 2 * super.phi * super.r;
        return keliling;
    }

    private double luasPermukaanUranus() {
        lUranus = 4 * super.phi * pow(super.r, 2);
        return lUranus;
    }

    private double volumeUranus() {
         vUranus = (double) 4 / 3 * super.phi * pow(super.r, 3);
        return vUranus;
    }

    private double kecepatanRotasiUranus() {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }

    private double kecepatanRevolusiUranus() {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }

    //METHOD GET 
    protected double getKelilingGarisTengahUranus() {
        return kelilingGarisTengahUranus();
    }

    protected double getLuasPermukaanUranus() {
        return luasPermukaanUranus();
    }

    protected double getVolumeUranus() {
        return volumeUranus();
    }

    protected double getKecepatanRotasiUranus() {
        return kecepatanRotasiUranus();
    }

    protected double getKecepatanRevolusiUranus() {
        return kecepatanRevolusiUranus();
    }

    @Override
   public void run() {
        synchronized (pt) {
            PenjalananThread.print("\nUranus : ", ""
                    + "\n - Keliling garis tengah : " + keliling + ""
                    + "\n - Luas Permukaan : " + lUranus + ""
                    + "\n - Volume : " + vUranus + ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi + ""
                    + "\n - Kecepatan Revolusi : " + kecRevolusi);
        }
    }
}
