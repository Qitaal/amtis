package com.example.amtis2;

import java.util.ArrayList;

public class HospitalData {
    private static int [] hospitalImages = {
            R.drawable.rsup_kariadi,
            R.drawable.rsup_soeradji,
            R.drawable.rs_paru_ario,
            R.drawable.rsud_kraton_pekalongan,
            R.drawable.rsud_soeselo,
            R.drawable.rsud_soewondo,
            R.drawable.rsud_tidar,
            R.drawable.rsud_moewardi,
            R.drawable.rsud_banyumas,
            R.drawable.rsud_loekmono
    };

    private static String [] hospitalNames = {
            "RSUP dr. Kariadi",
            "RSUO dr. Soeradji Tirtonegoro",
            "RS Paru Dr. Ario Wirawan",
            "RSUD Kraton Kab. Pekalongan",
            "RSUD Dr Soeselo Slawi",
            "RSUD Dr. H. Soewondo",
            "RSUD Tidar",
            "RDUD dr. Moewardi",
            "RSUD Banyumas",
            "RSUD Dr. Loekmonohadi Kudus"
    };

    private static String [] hospitalAddress = {
            "Jl. Dr. Soetomo No.16, Semarang",
            "Jl. KRT. Dr. Soeradji Tirtonegoro No.1, Klaten",
            "Jl. Hasanudin No.806, Salatiga",
            "Jl. Veteran No. 31, Pekalongan",
            "Jl. Dr. Sutomo No.63, Tegal",
            "Jl. Laut No.21, Kendal",
            "Jl. Tidar No.30 A, Magelang",
            "Jl. Kol. Sutarto No.132, Surakarta",
            "Jl. Rumah Sakit No.1, Banyumas",
            "Jl. Dr. Lukmonohadi No.19, Kudus"
    };

    static ArrayList<Hospital> getListData(){
        ArrayList<Hospital> list = new ArrayList<>();
        for (int i = 0; i < hospitalNames.length; i++){
            Hospital hospital = new Hospital();
            hospital.setImage(hospitalImages[i]);
            hospital.setName(hospitalNames[i]);
            hospital.setAddress(hospitalAddress[i]);
            list.add(hospital);
        }
        return list;
    }
}
