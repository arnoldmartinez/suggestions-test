package com.example.test.repository.impl;

import com.example.test.domain.Suggestion;
import com.example.test.repository.CitiesSuggestionsRepository;
import com.example.test.repository.db.InMemoryGeoNameDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InMemorySuggestionsRepository implements CitiesSuggestionsRepository {
    private final Suggestion suggestion = new Suggestion();

    @Autowired
    private InMemoryGeoNameDB db;

    @Override
    public Suggestion getSuggestion(String partialSearch, Double latitude, Double longitude) {
        suggestion.setSuggestions(db.filterBySuggestions(partialSearch, latitude, longitude));

        return suggestion;
    }
}
