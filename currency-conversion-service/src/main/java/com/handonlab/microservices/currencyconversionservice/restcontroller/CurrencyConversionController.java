/**
 * 
 */
package com.handonlab.microservices.currencyconversionservice.restcontroller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.handonlab.microservices.currencyconversionservice.beans.CurrencyConversionBean;
import com.handonlab.microservices.currencyconversionservice.proxy.CurrencyExchangeProxy;

/**
 * @author M.Othman
 *
 */
@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy exchangeServiceProxy;
	
	@GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity)
	{
		
		Map<String,String> uriVariables  = new HashMap<>();
		
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> response = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", 
				CurrencyConversionBean.class,uriVariables);
		
		CurrencyConversionBean result =  response.getBody();
		result.setId(265L);
		result.setAmount(result.getExchangeRate().multiply(quantity));
		
		return result;
	}
	
	@GetMapping("/feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyByFeign(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity)
	{
		
		CurrencyConversionBean result = exchangeServiceProxy.getExchangeRate(from, to);
		
		result.setId(265L);
		result.setAmount(result.getExchangeRate().multiply(quantity));
		
		return result;
	}
}
