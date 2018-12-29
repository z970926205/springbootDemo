package com.example.demo.jinx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.jinx.springSecurity.SSecurityService;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Bean
	UserDetailsService customUserService(){
		return new SSecurityService();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.userDetailsService(customUserService());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/Main/*", "/Login/*","/Register/*").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/Login/showLogin")
				.failureUrl("/Login/showLogin?message=security login failure")
				.permitAll()
			.and()
			.logout().permitAll();
	}
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        // 忽略URL
        web.ignoring().antMatchers("/**/*.css","/**/*.js","/**/*.jpg");
    }
	
}
