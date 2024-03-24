package com.ertikmen;

public class Yonetici extends Personel {
    protected double saatlikUcret;
    protected double bonus;

    public Yonetici(String name, String surname, double saatlikUcret,
                    double bonus,int calismaSaati) {
        super(name, surname, ERole.YONETICI,calismaSaati);
        this.saatlikUcret = (saatlikUcret < 500) ? 500 : saatlikUcret;
        this.bonus = bonus;
    }

    public Yonetici() {
        super();
    }

    @Override
    public double maasHesapla() {
        double toplamMaas=calismaSaati*saatlikUcret+bonus;

        return toplamMaas;
    }
}
