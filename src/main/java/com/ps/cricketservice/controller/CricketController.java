package com.ps.cricketservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.cricketservice.service.CricketService;

@Controller
@RequestMapping("/cricket")
public class CricketController {
	
	Logger logger = LoggerFactory.getLogger(CricketController.class);
	
	@Autowired
	private CricketService cricketService;
	
	@GetMapping(path = "/summary")
	public String getSummary(Model modelMap) {
		logger.info("received request from ui...");
        modelMap.addAttribute("summaryList", cricketService.retriveSummary());
		return "summary";
	}
}
