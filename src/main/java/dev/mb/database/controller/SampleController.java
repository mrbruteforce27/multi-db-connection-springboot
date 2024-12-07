package dev.mb.database.controller;

import dev.mb.database.service.DatabaseSampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class SampleController {

    private final DatabaseSampleService sampleService;

    public SampleController(DatabaseSampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/profile")
    public String misc(){
        return sampleService.printEnvironment();
    }
}
