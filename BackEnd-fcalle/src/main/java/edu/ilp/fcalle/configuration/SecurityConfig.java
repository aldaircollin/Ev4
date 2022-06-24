package edu.ilp.fcalle.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Created by AITAMH on 18/11/2019.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf()
                .disable()
                .exceptionHandling()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                    .maximumSessions(1)
                .and()
                .authorizeRequests()
                .antMatchers("/",
                        "/favicon.ico",
                        "/**/*.png",
                        "/**/*.gif",
                        "/**/*.svg",
                        "/**/*.jpg",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js")
                .permitAll()
                .antMatchers("/login/**").permitAll()
                .antMatchers("/estudiante/**").permitAll()
                .antMatchers("/docente/**").permitAll()
                .antMatchers("/curso/**").permitAll()
                .antMatchers("/administrativo/**").permitAll()
                .antMatchers("/asignatura/**").permitAll()
                .antMatchers("/persona/**").permitAll()
                .antMatchers("/escuela/**").permitAll()

                .anyRequest().authenticated();
//        http
//                .sessionManagement()
//                    .maximumSessions(1)
//                    .maxSessionsPreventsLogin(true);


    }
}
