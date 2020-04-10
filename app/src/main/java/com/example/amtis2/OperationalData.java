package com.example.amtis2;

import java.util.ArrayList;

public class OperationalData {
    private static int [] operationalImages = {
            R.drawable.op1,
            R.drawable.op2,
            R.drawable.op3,
            R.drawable.op4,
            R.drawable.op5,
            R.drawable.op6,
            R.drawable.op7,
            R.drawable.op8,
            R.drawable.op9,
            R.drawable.op10
    };

    private static String [] operationalNames = {
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV",
            "SUZUKI APV"
    };

    private static String [] operationalNumber = {
            "AB 0212 MNR",
            "AD 9427 KDY",
            "B 9104 SAI",
            "AE 0382 SDK",
            "K 9821 KQJ",
            "E 8266 SOH",
            "W 6435 PEG",
            "E 1947 ODF",
            "AD 3927 QWD",
            "B 9272 EWS",
    };

    private static String [] operationalRegion = {
            "Boyolali 1",
            "Boyolali 4",
            "Solo 2",
            "Solo 1",
            "Pekalongan 3",
            "Magelang 2",
            "Bekasi 4",
            "Tanggerang 1",
            "Klaten 3",
            "Boyolali 2"
    };

    static ArrayList<Operational> getListData(){
        ArrayList<Operational> list = new ArrayList<>();
        for (int i = 0; i < operationalNames.length; i++){
            Operational operational = new Operational();
            operational.setImage(operationalImages[i]);
            operational.setName(operationalNames[i]);
            operational.setNumber(operationalNumber[i]);
            operational.setRegion(operationalRegion[i]);
            list.add(operational);
        }
        return list;
    }
}
