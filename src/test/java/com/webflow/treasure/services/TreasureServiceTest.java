package com.webflow.treasure.services;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TreasureServiceTest {

    private TreasureService treasureService;

    @Before
    public void setUp() throws Exception {
        treasureService = new TreasureService();
    }

    @Test
    public void shouldReturnCountries() throws Exception {
        assertThat(treasureService.getCountries().size(),is(4));
    }

    @Test
    public void shouldReturnTreasures() throws Exception {
        assertThat(treasureService.getTreasures().size(),is(3));
    }

    @Test
    public void shouldInitTreasureMap() throws Exception {
        //when
        Map<String,String> treasureMap = treasureService.init();

        //then
        assertThat(treasureMap.keySet().size(),is(treasureService.getTreasures().size()));
    }
}
