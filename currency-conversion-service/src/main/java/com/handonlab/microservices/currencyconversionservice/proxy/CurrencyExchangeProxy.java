/**
 * 
 */
package com.handonlab.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.handonlab.microservices.currencyconversionservice.beans.CurrencyConversionBean;


/**
 * @author M.Othman
 *
 */
@FeignClient(name="currency-exchange-service" , url = "localhost:8000/currency-exchange")
public interface CurrencyExchangeProxy {

	
	@GetMapping("/from/{from}/to/{to}")
	public CurrencyConversionBean getExchangeRate(@PathVariable String from , @PathVariable String to);
}
