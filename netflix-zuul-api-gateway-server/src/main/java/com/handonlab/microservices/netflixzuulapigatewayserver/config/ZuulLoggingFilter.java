/**
 * 
 */
package com.handonlab.microservices.netflixzuulapigatewayserver.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author M.Othman
 *
 */
@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		logger.info("Request -> {} Request URI -> {}" , request , request.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		//define whether filter will be applied pre request , post request , error
		return "pre";
	}

	@Override
	public int filterOrder() {
		
		return 1;
	}

}
