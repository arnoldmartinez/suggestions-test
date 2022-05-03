package com.example.test.controllers;

import com.example.test.domain.Suggestion;
import com.example.test.service.CitiesSuggestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CitiesSuggestionsController {

    @Autowired
    private CitiesSuggestionsService service;

    @GetMapping(path = "suggestions", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Suggestion> getSuggestion(@RequestParam("q") String partialSearch,
                                                   @RequestParam(value = "latitude", required = false) Double latitude,
                                                   @RequestParam(value = "longitude", required = false) Double longitude) {

        return new ResponseEntity<Suggestion>(
                service.getSuggestion(partialSearch, latitude, longitude),
                HttpStatus.OK
        );
    }
}
