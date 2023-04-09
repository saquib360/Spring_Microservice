package com.infybuzz.feignclients;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

import feign.Feign;

@LoadBalancerClient(value= "address-client")
public class AdrSerLoadBalConfig {
	public Feign.Builder feignBuilder(){
		return feignBuilder();
	}

}
