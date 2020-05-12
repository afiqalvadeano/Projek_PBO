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
public class Jupiter extends Bola implements Runnable {

    protected double  kRotasi, kRevolusi;
    protected static double keliling, kecRotasi, kecRevolusi, lJupiter, vJupiter,pRevolusi;
    Thread thread;
    PenjalananThread pt;

    public Jupiter(double radius, double pLintasanRevolusi, double kRotasi, double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pRevolusi;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);

        //MENGISI NILAI
        kelilingGarisTengahJupiter();
        luasPermukaanJupiter();
        volumeJupiter();
        kecepatanRotasiJupiter();
        kecepatanRevolusiJupiter();
    }

    private double kelilingGarisTengahJupiter() {
        keliling = 2*super.phi*super.r;
        return keliling ;
    }

    private double luasPermukaanJupiter() {
         lJupiter = 4 * super.phi* pow(super.r,2) ;
         return lJupiter;
    }

    private double volumeJupiter() {
        vJupiter = (double) 4 / 3 * super.phi * pow(super.r, 3);
        return vJupiter;
    }

    private double kecepatanRotasiJupiter() {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }

    private double kecepatanRevolusiJupiter() {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }

    //METHOD GET 
    protected double getKelilingGarisTengahJupiter() {
        return kelilingGarisTengahJupiter();
    }

    protected double getLuasPermukaanJupiter() {
        return luasPermukaanJupiter();
    }

    protected double getVolumeJupiter() {
        return volumeJupiter();
    }

    protected double getKecepatanRotasiJupiter() {
        return kecepatanRotasiJupiter();
    }

    protected double getKecepatanRevolusiJupiter() {
        return kecepatanRevolusiJupiter();
    }

    @Override
    public void run() {
        synchronized (pt) {
            PenjalananThread.print("\nJupiter : ", ""
                    + "\n - Keliling garis tengah : " + keliling + ""
                    + "\n - Luas Permukaan : " + lJupiter + ""
                    + "\n - Volume : " + vJupiter + ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi + ""
                    + "\n - Kecepatan Revolusi : " + kecRevolusi);
        }
    }
}
