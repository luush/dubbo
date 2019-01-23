package org.lszjaf.dagger.service.impl;

import org.lszjaf.dagger.service.DubboService;

import java.util.Random;

public class DubboServiceImpl implements DubboService {

    @Override
    public Integer getNumber(String s) {
        return new Random().nextInt(30);
    }
}
