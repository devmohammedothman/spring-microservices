/**
 * 
 */
package com.handonlab.microservices.limitsservice.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handonlab.microservices.limitsservice.bean.LimitConfiguration;
import com.handonlab.microservices.limitsservice.config.ApplicationConfiguration;

/**
 * @author M.Othman
 *
 */

@RestController
public class LimitsConfigController {

	@Autowired
	private ApplicationConfiguration appConfig;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitsFromconfig()
	{
		return new LimitConfiguration(appConfig.getMaximum(), appConfig.getMinimum());
	}
}
