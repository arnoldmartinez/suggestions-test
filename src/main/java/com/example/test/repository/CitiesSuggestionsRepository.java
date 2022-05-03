package com.example.test.repository;

import com.example.test.domain.Suggestion;

public interface CitiesSuggestionsRepository {
    public Suggestion getSuggestion(String partialSearch, Double latitude, Double longitude);
}
