package com.sonpen.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by sonikju on 2018-08-19.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Bean
    public HttpMessageConverters customConverters() {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        return new HttpMessageConverters((converter));
    }
}
