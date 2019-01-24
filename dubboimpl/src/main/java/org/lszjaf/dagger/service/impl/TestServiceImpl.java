package org.lszjaf.dagger.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lszjaf.dagger.service.TestService;

@Service(timeout = 2000,protocol = {"dubbo"})
public class TestServiceImpl implements TestService {

    public String getName(String id) {
        return "luush" + id;
    }
}
