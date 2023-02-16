package com.example.config;

import com.example.service.UserAuthService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Resource
    UserAuthService service;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/static/**").permitAll()
                .anyRequest().hasAnyRole("admin","user")
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/doLogin")
                .permitAll()
                .defaultSuccessUrl("/index",true)
                .and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(service)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

}

