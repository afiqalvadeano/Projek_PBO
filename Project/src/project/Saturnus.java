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
public class Saturnus extends Bola implements Runnable {

    protected double  kRotasi, kRevolusi;
    protected static double keliling, kecRotasi, kecRevolusi, lSaturnus, vSaturnus,pRevolusi;
    Thread thread;
    PenjalananThread pt;

    public Saturnus(double radius, double pLintasanRevolusi, double kRotasi, double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pLintasanRevolusi;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);

        kelilingGarisTengahSaturnus();
        luasPermukaanSaturnus();
        volumeSaturnus();
        kecepatanRotasiSaturnus();
        kecepatanRevolusiSaturnus();
    }

    private double kelilingGarisTengahSaturnus() {
        keliling = 2 * super.phi * super.r;
        return keliling;
    }

    private double luasPermukaanSaturnus() {
        lSaturnus = 4 * super.phi * pow(super.r, 2);
        return lSaturnus;
    }

    private double volumeSaturnus() {
        vSaturnus = (double) 4 / 3 * super.phi * pow(super.r, 3);
        return vSaturnus;
    }

    private double kecepatanRotasiSaturnus() {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }

    private double kecepatanRevolusiSaturnus() {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }

    //METHOD GET 
    protected double getKelilingGarisTengahSaturnus() {
        return kelilingGarisTengahSaturnus();
    }

    protected double getLuasPermukaanSaturnus() {
        return luasPermukaanSaturnus();
    }

    protected double getVolumeSaturnus() {
        return volumeSaturnus();
    }

    protected double getKecepatanRotasiSaturnus() {
        return kecepatanRotasiSaturnus();
    }

    protected double getKecepatanRevolusiSaturnus() {
        return kecepatanRevolusiSaturnus();
    }

    @Override
    public void run() {
        synchronized (pt) {
            PenjalananThread.print("\nSaturnus : ", ""
                    + "\n - Keliling garis tengah : " + keliling + ""
                    + "\n - Luas Permukaan : " + lSaturnus + ""
                    + "\n - Volume : " + vSaturnus + ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi + ""
                    + "\n - Kecepatan Revolusi : " + kecRevolusi);
        }
    }
}
