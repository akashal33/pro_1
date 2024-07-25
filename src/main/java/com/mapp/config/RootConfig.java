package com.mapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.mapp.service","com.mapp.repositories"})
@Import(PersistanceConfig.class)
public class RootConfig {

	
	
}
