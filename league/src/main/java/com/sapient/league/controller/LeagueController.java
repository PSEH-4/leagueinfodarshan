package com.sapient.league.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.league.model.LeagueInfo;
import com.sapient.league.model.ResponseDetails;
import com.sapient.league.service.LeagueService;

@RestController
public class LeagueController {

	@Autowired
	private LeagueService leagueService;

	@GetMapping("/leagueInfo")
	public ResponseEntity<ResponseDetails<LeagueInfo>> getLeageInfo() {
		List<LeagueInfo> list = leagueService.getLeageInfo();
		ResponseDetails<LeagueInfo> res = new ResponseDetails<LeagueInfo>(true, list, null);
		return new ResponseEntity<ResponseDetails<LeagueInfo>>(res, HttpStatus.ACCEPTED);
	}
}
