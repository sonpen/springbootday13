package com.sonpen.config;

import com.sonpen.user.UserConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by sonikju on 2018-08-19.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new UserConverter());
//    }

    //    @Bean
//    public HttpMessageConverters customConverters() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        return new HttpMessageConverters((converter));
//    }


}
