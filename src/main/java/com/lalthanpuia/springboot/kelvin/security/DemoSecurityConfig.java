package com.lalthanpuia.springboot.kelvin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests()
				.antMatchers("/index","/student/main-page").permitAll()
				.antMatchers("/adminShowAll").hasRole("ADMIN")
				.and()
				.formLogin()
				.loginPage("/login")
				.permitAll();	
	}
				
	@Autowired
	public void configureGlobal (AuthenticationManagerBuilder auth) throws Exception {
		
		auth
			.inMemoryAuthentication()
				.withUser("admin").password("{noop}admin").roles("ADMIN")
				.and()
				.withUser("Jojo").password("{noop}jojo").roles("USER");
	}
}

