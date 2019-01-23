package org.lszjaf.dagger.servicedubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lszjaf.dagger.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    public String getName(String id) {
        return "luush" + id;
    }
}
