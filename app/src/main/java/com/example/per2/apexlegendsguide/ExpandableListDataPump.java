package com.example.per2.apexlegendsguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> snipers = new ArrayList<String>();
        snipers.add("Kraber .50-cal Sniper");
        snipers.add("Longbow DMR");
        snipers.add("G7 Scout");
        snipers.add("Triple Take");

        List<String> ar = new ArrayList<String>();
        ar.add("Hemlok Burst AR");
        ar.add("R-301 Carbine");
        ar.add("VK-47 Flatline");
        ar.add("HAVOC");

        List<String> lmg = new ArrayList<String>();
        lmg.add("M600 Spitfire");
        lmg.add("Devotion");

        List<String> smg = new ArrayList<String>();
        smg.add("R-99");
        smg.add("Prowler Burst PDW");
        smg.add("Alternator SMG");

        List<String> shotgun = new ArrayList<String>();
        shotgun.add("Mastiff Shotgun");
        shotgun.add("EVA-8 Auto");
        shotgun.add("Peacekeeper");
        shotgun.add("Trash Gun");

        List<String> pistol = new ArrayList<String>();
        pistol.add("Wingman");
        pistol.add("RE-45 Auto");
        pistol.add("P2020");

        expandableListDetail.put("SNIPER", snipers);
        expandableListDetail.put("ASSAULT RIFLE", ar);
        expandableListDetail.put("LMG", lmg);
        expandableListDetail.put("SMG", smg);
        expandableListDetail.put("SHOTGUN", shotgun);
        expandableListDetail.put("PISTOL", pistol);
        return expandableListDetail;
    }
}