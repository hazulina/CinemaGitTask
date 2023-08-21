package com.example.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ViewerStatistics viewerStatistics = context.getBean(ViewerStatistics.class);
        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(new Viewer("mike", 25));
        viewerList.add(new Viewer("sophy", 18));
        viewerList.add(new Viewer("den", 45));
        viewerList.add(new Viewer("gala", 29));
        viewerList.add(new Viewer("oleg", 38));

        System.out.println(viewerStatistics.averageAge(viewerList));


    }

}
