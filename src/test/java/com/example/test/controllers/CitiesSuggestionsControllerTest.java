package com.example.test.controllers;

import com.example.test.domain.GeoName;
import com.example.test.domain.Suggestion;
import com.example.test.service.CitiesSuggestionsService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class CitiesSuggestionsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CitiesSuggestionsService service;

    private Suggestion suggestion;

    public CitiesSuggestionsControllerTest() {
        GeoName highestRatedGeoName = new GeoName();
        highestRatedGeoName.setName("London, ON, Canada");
        highestRatedGeoName.setLatitude(42.98339);
        highestRatedGeoName.setLongitude(-81.23304);
        highestRatedGeoName.setScore(0.9);

        GeoName lowestRatedGeoName = new GeoName();
        lowestRatedGeoName.setName("Londontowne, MD, USA");
        lowestRatedGeoName.setLatitude(38.93345);
        lowestRatedGeoName.setLongitude(-76.54941);
        lowestRatedGeoName.setScore(0.3);

        List<GeoName> geoNames = new ArrayList<>();
        geoNames.add(highestRatedGeoName);
        geoNames.add(lowestRatedGeoName);

        suggestion = new Suggestion();
        suggestion.setSuggestions(geoNames);
    }

    @Test
    public void get_the_highest_rated_geo_name_suggestion() throws Exception {
        Mockito.when(service.getSuggestion(
                            ArgumentMatchers.anyString(),
                            ArgumentMatchers.anyDouble(),
                            ArgumentMatchers.anyDouble())
                    ).thenReturn(suggestion);


        this.mockMvc.perform(
                MockMvcRequestBuilders.get("/suggestions?q=Londo&latitude=42.98339&longitude=-81.23304"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath(
                                "$.suggestions[0].name",
                                Matchers.equalTo(suggestion.getSuggestions().get(0).getName())
                        )
                )
                .andExpect(
                        jsonPath(
                                "$.suggestions[0].latitude",
                                Matchers.equalTo(suggestion.getSuggestions().get(0).getLatitude())
                        )
                )
                .andExpect(
                        jsonPath(
                                "$.suggestions[0].longitude",
                                Matchers.equalTo(suggestion.getSuggestions().get(0).getLongitude())
                        )
                )
                .andExpect(
                        jsonPath(
                                "$.suggestions[0].score",
                                Matchers.equalTo(suggestion.getSuggestions().get(0).getScore())
                        )
                );
    }

    @Test
    public void get_the_lowest_rated_geo_name_suggestion() throws Exception {
        Mockito.when(service.getSuggestion(
                ArgumentMatchers.anyString(),
                ArgumentMatchers.anyDouble(),
                ArgumentMatchers.anyDouble())
        ).thenReturn(suggestion);


        this.mockMvc.perform(
                        MockMvcRequestBuilders.get("/suggestions?q=Londo&latitude=38.93345&longitude=-76.54941"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath(
                                "$.suggestions[1].name",
                                Matchers.equalTo(suggestion.getSuggestions().get(1).getName())
                        )
                )
                .andExpect(
                        jsonPath(
                                "$.suggestions[1].latitude",
                                Matchers.equalTo(suggestion.getSuggestions().get(1).getLatitude())
                        )
                )
                .andExpect(
                        jsonPath(
                                "$.suggestions[1].longitude",
                                Matchers.equalTo(suggestion.getSuggestions().get(1).getLongitude())
                        )
                )
                .andExpect(
                        jsonPath(
                                "$.suggestions[1].score",
                                Matchers.equalTo(suggestion.getSuggestions().get(1).getScore())
                        )
                );
    }
}
