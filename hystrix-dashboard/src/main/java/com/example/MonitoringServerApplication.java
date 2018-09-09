package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * The starter of the Monitoring server
 * 
 * @author aleksandar.kovachev
 *
 */
@EnableTurbine
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
public class MonitoringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringServerApplication.class, args);
	}
}
