/**
 * 
 */
package com.handonlab.microservices.currencyconversionservice.restcontroller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.handonlab.microservices.currencyconversionservice.beans.CurrencyConversionBean;

/**
 * @author M.Othman
 *
 */
@RestController
public class CurrencyConversionController {

	
	@GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity)
	{
		
		Map<String,String> uriVariables  = new HashMap<>();
		
		uriVariables.put("from", from.toUpperCase());
		uriVariables.put("to", to.toUpperCase());
		
		ResponseEntity<CurrencyConversionBean> response = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", 
				CurrencyConversionBean.class,uriVariables);
		
		CurrencyConversionBean result =  response.getBody();
		result.setId(265L);
		result.setAmount(result.getExchangeRate().multiply(quantity));
		
		return result;
	}
}
