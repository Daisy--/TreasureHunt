package com.webflow.treasure.services;


import org.springframework.stereotype.Service;

import java.util.*;

@Service("treasureService")
public class TreasureService {

    private List<String> countries = Arrays.asList("China", "Australia", "England", "United States");

    private List<String> treasures = Arrays.asList("Diamond", "Gold", "Gemstone");

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

    public void addTreasure(Map<String,String> treasuresFound,Map<String,String> treasuresMap,String treasure){
        String tempTreasure;
        for (String country:treasuresMap.keySet()){
            tempTreasure = treasuresMap.get(country);
            if(tempTreasure.equals(treasure)){
                treasuresFound.put(treasure, country);
                treasuresMap.remove(country);
                break;
            }
        }
    }


    public String hasTreasure(Map<String, String> treasureMap,String country){
        return treasureMap.get(country);
    }
}
