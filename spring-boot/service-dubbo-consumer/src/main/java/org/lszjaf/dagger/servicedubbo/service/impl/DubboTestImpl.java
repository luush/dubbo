package org.lszjaf.dagger.servicedubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.lszjaf.dagger.service.DubboService;
import org.springframework.stereotype.Service;

@Service
public class DubboTestImpl {

    //dubbo使用
    @Reference
    private DubboService dubboService;

    public Integer testDubbo(String name){
        return dubboService.getNumber(name);
    }
}
