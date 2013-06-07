package com.webflow.treasure.services;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("treasureService")
public class TreasureService {


    private List<String> countries = Arrays.asList("China","Australia","England","United States");

    public List<String> getCountries(){
        return countries;
    }
}
