package org.lszjaf.dagger.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lszjaf.dagger.service.DubboService;

import java.util.Random;
@Service(timeout = 2000,protocol = {"dubbo"})
public class DubboServiceImpl implements DubboService {

    @Override
    public Integer getNumber(String s) {
        return new Random().nextInt(30);
    }
}
