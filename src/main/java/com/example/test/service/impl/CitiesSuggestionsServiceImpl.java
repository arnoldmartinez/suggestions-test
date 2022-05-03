package com.example.test.service.impl;

import com.example.test.domain.Suggestion;
import com.example.test.repository.CitiesSuggestionsRepository;
import com.example.test.service.CitiesSuggestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitiesSuggestionsServiceImpl implements CitiesSuggestionsService {

    @Autowired
    private CitiesSuggestionsRepository repository;

    @Override
    public Suggestion getSuggestion(String partialSearch, Double latitude, Double longitude) {
        return repository.getSuggestion(partialSearch, latitude, longitude);
    }
}
