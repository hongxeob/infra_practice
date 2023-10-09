package com.example.infra_practice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class MemberController {

	@GetMapping("/members")
	@ApiOperation("회원조회")
	public void get() {

	}

	@PostMapping("/members")
	@ApiOperation("회원등록")
	public void register() {

	}

	@DeleteMapping("/members")
	@ApiOperation("회원삭제")
	public void delete() {

	}
}
