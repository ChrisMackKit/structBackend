package edu.kit.tm.cm.backend.application.services;

import org.springframework.stereotype.Service;

@Service
public class BackendService {
    public Object[] findAll() {
        Object[] tests = {"Test1", "Test2"};
        return tests;
    }
}
