package org.lszjaf.dagger.servicedubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.lszjaf.dagger.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestDubboImpl {

    //dubbo使用
    @Reference
    private TestService testService;

    public String testDubbo(String id){
        return testService.getName(id);
    }
}
