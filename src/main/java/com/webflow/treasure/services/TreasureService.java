package com.webflow.treasure.services;


import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.*;

@Service("treasureService")
public class TreasureService {

    public static final int TREASURE_NUMBER = 3;
    private List<String> countries = Arrays.asList("China", "Australia", "England", "United States");

    private List<String> treasures = Arrays.asList("Diamond", "Gold", "Gemstone");

    private boolean isSuccess;
    private int guessTimes = 0;
    private double score = 0;

    public List<String> getCountries() {
        return countries;
    }

    public List<String> getTreasures() {
        return treasures;
    }

    public Map<String, String> getBag() {
        return new HashMap<String, String>();
    }

    public Map<String, String> getTreasureMap() {
        Map<String, String> treasureMap = new HashMap<String, String>();
        Random random = new Random();
        List<String> tempCountries = new ArrayList<String>();
        tempCountries.addAll(countries);
        for (String treasure : treasures) {
            treasureMap.put(tempCountries.remove(random.nextInt(tempCountries.size())),treasure);
        }
        return treasureMap;
    }

    public void addTreasure(Map<String, String> treasuresFound, Map<String, String> treasuresMap, String treasure) {
        String tempTreasure;
        for (String country : treasuresMap.keySet()) {
            tempTreasure = treasuresMap.get(country);
            if (tempTreasure.equals(treasure)) {
                treasuresFound.put(treasure, country);
                treasuresMap.remove(country);
                break;
            }
        }
        if (treasuresFound.size() == 3) {
            setSuccess(true);
        }
    }


    public String hasTreasure(Map<String, String> treasureMap,String country){
        return treasureMap.get(country);
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void calculate(){
        guessTimes++;
        DecimalFormat df =new java.text.DecimalFormat("#.00");
        score = Double.parseDouble(df.format(TREASURE_NUMBER/(double)guessTimes)) * 100;
    }

    public int getScore() {
        return (int)score;
    }
}
