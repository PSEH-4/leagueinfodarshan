package com.sapient.league.restservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.league.model.LeagueInfo;

@Service
public class LeagueRestService {

	@Autowired
	RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	public List<LeagueInfo> getLegueInfo() {
		final String url = "https://apiv2.apifootball.com/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity leagueInfoList= restTemplate.exchange(url,HttpMethod.GET,entity,List.class);
		return (List<LeagueInfo>) leagueInfoList.getBody();
	}
}
