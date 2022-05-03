package com.example.test.service;

import com.example.test.domain.Suggestion;

public interface CitiesSuggestionsService {
    public Suggestion getSuggestion(String partialSearch, Double latitude, Double longitude);
}
