/**
 * 
 */
package com.handonlab.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.handonlab.microservices.currencyconversionservice.beans.CurrencyConversionBean;


/**
 * @author M.Othman
 *
 */
//@FeignClient(name="currency-exchange-service" , url = "localhost:8000/currency-exchange")

//configure ribbon as client load balancer to distribute balance between instances of currency exchange services
//no need to specify url in feign client because ribbon will handle different instances (urls) of exchange  service

//disable fiegn client and replace the name of the client with zuul api gate way naming server 
//to make the call for exchange service done through zuul api gate way
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {

	
	@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	public CurrencyConversionBean getExchangeRate(@PathVariable String from , @PathVariable String to);
}
