package com.example.test.domain;

import java.util.List;

public class Suggestion {
    private List<GeoName> suggestions;

    public List<GeoName> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<GeoName> suggestions) {
        this.suggestions = suggestions;
    }
}
