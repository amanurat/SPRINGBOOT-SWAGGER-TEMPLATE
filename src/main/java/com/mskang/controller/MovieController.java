package com.mskang.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mskang.model.Movie;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "Movie", description = "API about movie")
@RestController
public class MovieController {

	@ApiOperation(value = "find movie")
	@RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
	public Movie find(@PathVariable(value = "id") String id) {
		return new Movie();
	}

	@ApiOperation(value = "modify movie")
	@RequestMapping(value = "/movie", method = RequestMethod.PUT)
	public Movie modify(Movie movie) {
		return new Movie();
	}

	@ApiOperation(value = "add movie")
	@RequestMapping(value = "/movie", method = RequestMethod.POST)
	public Movie add(Movie movie) {
		return new Movie();
	}

	@ApiOperation(value = "delete movie")
	@RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable(value = "id") String id) {
		return "SUCCESS";
	}
}
