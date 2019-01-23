package org.lszjaf.dagger.servicedubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lszjaf.dagger.service.DubboService;

import java.util.Random;
@Service
public class DubboServiceImpl implements DubboService {

    @Override
    public Integer getNumber(String s) {
        return new Random().nextInt(30);
    }
}
