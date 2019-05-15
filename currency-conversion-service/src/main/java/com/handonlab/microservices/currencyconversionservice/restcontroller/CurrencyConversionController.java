/**
 * 
 */
package com.handonlab.microservices.currencyconversionservice.restcontroller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
		return new CurrencyConversionBean();
	}
}
