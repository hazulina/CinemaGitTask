package com.example.cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    ViewerStatistics viewerStatistics() {
        return new ViewerStatistics();
    }
}
