package com.magencevoyage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.magencevoyage.service.imp.AppUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private AppUserDetailService appUserDetailService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(appUserDetailService).passwordEncoder(bCryptPasswordEncoder);
		
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
				.permitAll()
			.and()
			.logout()
				.logoutUrl("/logout")
				.permitAll()
				.and()
			.httpBasic()
			.and()
			.csrf().disable();
			
	}

}
