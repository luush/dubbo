package org.lszjaf.dagger.servicedubbo.controller;

import org.lszjaf.dagger.servicedubbo.service.impl.DubboTestImpl;
import org.lszjaf.dagger.servicedubbo.service.impl.TestDubboImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubbo {

    @Autowired
    private TestDubboImpl testDubbo;
    @Autowired
    private DubboTestImpl dubboTest;

    @GetMapping("/testd/{id}")
    public String testDubbo(@PathVariable String id) {
        return testDubbo.testDubbo(id);
    }

    @GetMapping("/testdu/{name}")
    public Integer testDubbod(@PathVariable String name) {
        return dubboTest.testDubbo(name);
    }
}
