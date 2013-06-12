package com.webflow.treasure.services;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
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
        Map<String,String> treasureMap = treasureService.getTreasureMap();

        //then
        assertThat(treasureMap.keySet().size(),is(treasureService.getTreasures().size()));
    }

    @Test
    public void shouldAddTreasure() throws Exception {
        // given
        Map<String,String> treasureMap = new HashMap<String,String>();
        Map<String,String> treasureFound = new HashMap<String,String>();
        treasureMap.put("country1","treasure1");
        treasureMap.put("country2","treasure2");

        // when
        treasureService.addTreasure(treasureFound,treasureMap,"treasure1");

        // then
        assertThat(treasureMap.keySet().size(),is(1));
        assertThat(treasureFound.size(),is(1));

    }

    @Test
    public void shouldGet100WhenGuessThreeTimes() throws Exception {
        treasureService.calculate();
        treasureService.calculate();
        treasureService.calculate();

        assertThat(treasureService.getScore(),is(100));
    }

    @Test
    public void shouldGet75WhenGuessFourTimes() throws Exception {
        treasureService.calculate();
        treasureService.calculate();
        treasureService.calculate();
        treasureService.calculate();

        assertThat(treasureService.getScore(), is(75));
    }
}
