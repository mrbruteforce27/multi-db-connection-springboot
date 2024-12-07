package dev.mb.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class DatabaseSampleService {

    @Autowired
    Environment environment;

    public String printEnvironment(){
        System.out.println("Active profiels"+environment.getActiveProfiles());
        return environment.getProperty("spring.active.profiles");
    }
}
