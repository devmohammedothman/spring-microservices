/**
 * 
 */
package com.handonlab.microservices.currencyexchangeservice.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.handonlab.microservices.currencyexchangeservice.dao.ExchangeValueDao;
import com.handonlab.microservices.currencyexchangeservice.restcontroller.bean.ExchangeValue;

/**
 * @author M.Othman
 *
 */

@RestController
public class CurrencyExchangeController {

	
	@Autowired
	private Environment env;
	
	
	@Autowired
	private ExchangeValueDao exchangeDao;
	
	@GetMapping("/from/{from}/to/{to}")
	public ExchangeValue getExchangeRate(@PathVariable String from , @PathVariable String to)
	{
		ExchangeValue exchangeValue =  exchangeDao.findByFromAndTo(from, to);
		
		exchangeValue.setPort( 
				Integer.parseInt(env.getProperty("local.server.port")));
		
		return exchangeValue;
	}
}
