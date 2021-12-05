package be.intecbrussel.householdwindyproject.config;

import be.intecbrussel.householdwindyproject.service.*;
import be.intecbrussel.householdwindyproject.service.enums.Tool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class BeanFactory {

    List<Tool> tools;

    @Bean
    public Broom createBroom() {
        return new Broom();
    }

    @Bean
    public Swiffer swiffer() {
        return new Swiffer();
    }

    @Bean
    public VacuumCleaner createVacuumCleaner() {
        return new VacuumCleaner();
    }

    @Primary
    @Bean
    public CleaningRobot createCleaningRobot(){
        return new CleaningRobot(tools);
    }

    @PostConstruct
    @Bean
    public CleaningServiceImpl cleaningServiceImpl(){
        return new CleaningServiceImpl();
    }
}
