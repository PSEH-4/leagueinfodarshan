package com.sapient.league.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sapient.league.model.LeagueInfo;
import com.sapient.league.restservice.LeagueRestService;

@Service
public class LeagueService {

	@Autowired
	LeagueRestService leagueRestService;

	public List<LeagueInfo> getLeageInfo() {
		return leagueRestService.getLegueInfo();
	}
}
