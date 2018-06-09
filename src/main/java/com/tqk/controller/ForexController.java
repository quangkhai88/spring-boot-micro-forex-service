package com.tqk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqk.entity.Exchange;
import com.tqk.repo.ExchangeRepository;

/**
*
*khaitq on 9 juin 2018
*/

@RestController
public class ForexController {
	
	
	@Autowired
	private ExchangeRepository repository;

	@Autowired
	private Environment environment;

	
	@RequestMapping("/forex/from/{from}/to/{to}")
	public Exchange getExchangeValue(@PathVariable String from,@PathVariable String to) {
		Exchange exchange = repository.findByFromAndTo(from, to);
		if (exchange != null)
		exchange.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchange;
		
	}

}


