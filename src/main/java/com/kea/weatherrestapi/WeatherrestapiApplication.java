package com.kea.weatherrestapi;

import Model.Weather;
//import Model.WeatherOld;
//import Service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class WeatherrestapiApplication {

    private static final Logger log = LoggerFactory.getLogger(WeatherrestapiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WeatherrestapiApplication.class, args);}

        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder builder) {
            return builder.build();
        }

        @Bean
        public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
            return args -> {
                Weather weather = restTemplate.getForObject(
                        "http://api.openweathermap.org/data/2.5/weather?q=copenhagen&appid=ad2be13e7160fd63bc460a481dde7b83", Weather.class);
                log.info(weather.toString());
                System.out.println("cloudss" + weather.getClouds());

                //WeatherService weatherService = new WeatherService();
                //weatherService.insert(weather);
            };
        }


}
