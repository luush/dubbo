package org.lszjaf.dagger.service.impl;

import org.lszjaf.dagger.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String getName(String id) {
        return "luush"+id;
    }
}
