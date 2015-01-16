package com.mskang.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mskang.model.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "User", description = "API about user")
@RestController
public class UserController {

	@ApiOperation(value = "find user")
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User find(@PathVariable(value = "id") String id) {
		return new User();
	}

	@ApiOperation(value = "modify user")
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public User modify(User user) {
		return new User();
	}

	@ApiOperation(value = "add user")
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User add(User user) {
		return new User();
	}

	@ApiOperation(value = "delete user")
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable(value = "id") String id) {
		return "SUCCESS";
	}
}
