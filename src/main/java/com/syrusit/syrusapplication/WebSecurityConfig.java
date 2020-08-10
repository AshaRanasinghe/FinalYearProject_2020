package com.syrusit.syrusapplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

@Override
    protected void configure(HttpSecurity security) throws Exception{

    security
            .authorizeRequests()
             .antMatchers("/newemployee","/insertGender","/login","/admin","/neworder").permitAll()
            .antMatchers("/admin").permitAll()
            .antMatchers("webjars/jquery/1.9.1/jquery.min.js").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .permitAll();

}


}
