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
public class Mars extends Bola implements Runnable {

    protected double  kRotasi, kRevolusi;
    protected static double keliling, kecRotasi, kecRevolusi, lMars, vMars,pRevolusi;
    Thread thread;
    PenjalananThread pt;

    public Mars(double radius, double pLintasanRevolusi, double kRotasi, double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pLintasanRevolusi;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);

        //MENGISI NILAI
        getKelilingGarisTengahMars();
        getLuasPermukaanMars();
        getVolumeMars();
        getKecepatanRotasiMars();
        getKecepatanRevolusiMars();
    }

    private double kelilingGarisTengahMars() {
        keliling = 2 * super.phi * super.r;
        return keliling;
    }

    private double luasPermukaanMars() {
        lMars = 4 * super.phi * pow(super.r, 2);
        return lMars;
    }

    private double volumeMars() {
        vMars = (double) 4 / 3 * super.phi * pow(super.r, 3);
        return vMars;
    }

    private double kecepatanRotasiMars() {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }

    private double kecepatanRevolusiMars() {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }

    //METHOD GET 
    protected double getKelilingGarisTengahMars() {
        return kelilingGarisTengahMars();
    }

    protected double getLuasPermukaanMars() {
        return luasPermukaanMars();
    }

    protected double getVolumeMars() {
        return volumeMars();
    }

    protected double getKecepatanRotasiMars() {
        return kecepatanRotasiMars();
    }

    protected double getKecepatanRevolusiMars() {
        return kecepatanRevolusiMars();
    }

    @Override
    public void run() {
        synchronized (pt) {
            PenjalananThread.print("\nMars : ", ""
                    + "\n - Keliling garis tengah : " + keliling + ""
                    + "\n - Luas Permukaan : " + lMars + ""
                    + "\n - Volume : " + vMars + ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi + ""
                    + "\n - Kecepatan Revolusi : " + kecRevolusi);
        }
    }
}
