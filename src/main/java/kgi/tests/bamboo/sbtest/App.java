package kgi.tests.bamboo.sbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * Created by kgignatyev on 2/6/16.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        System.out.println("Let\'s inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        String[] var3 = beanNames;
        int var4 = beanNames.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String beanName = var3[var5];
            System.out.println(beanName);
        }

    }
}
