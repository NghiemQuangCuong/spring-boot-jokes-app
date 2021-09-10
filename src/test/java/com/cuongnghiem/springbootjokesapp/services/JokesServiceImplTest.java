package com.cuongnghiem.springbootjokesapp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokesServiceImplTest {

    JokesServiceImpl jokesServiceImpl;

    @BeforeEach
    void setUp() {
        jokesServiceImpl = new JokesServiceImpl();
    }

    @Test
    void getJokes() {
        System.out.println(jokesServiceImpl.getJoke());
    }
}