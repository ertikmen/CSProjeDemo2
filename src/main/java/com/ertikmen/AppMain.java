package com.ertikmen;

import org.json.simple.JSONArray;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        JSONArray personelList=DosyaOku.oku(
                "src/main/java/com/ertikmen/ornek.json");

        MaasBordro.rapor(personelList);


    }
}

/*
{
"bordro": "SUBAT 2020",
"personel": {
"ismi": "Beyazıt",
"calismaSaati": 200,
"odemeDetaylari": {
"anaOdeme": "₺9.000,00",
"mesai": "₺1.000,00",
"toplamOdeme": "₺10.000,00"
}
}
}
 */