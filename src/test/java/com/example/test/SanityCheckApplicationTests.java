package com.example.test;

import com.example.test.controllers.CitiesSuggestionsController;
import com.example.test.repository.CitiesSuggestionsRepository;
import com.example.test.service.CitiesSuggestionsService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SanityCheckApplicationTests {

	@Autowired
	private CitiesSuggestionsController controller;

	@Autowired
	private CitiesSuggestionsService service;

	@Autowired
	private CitiesSuggestionsRepository repository;

	@Test
	void context_loads_sanity_check() {
		Assertions.assertThat(controller).isNotNull();
		Assertions.assertThat(service).isNotNull();
		Assertions.assertThat(repository).isNotNull();
	}
}
