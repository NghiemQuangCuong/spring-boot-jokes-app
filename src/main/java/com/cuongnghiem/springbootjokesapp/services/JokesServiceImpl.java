package com.cuongnghiem.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by cuongnghiem on 10/09/2021
 **/

@Service
public class JokesServiceImpl implements JokesService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
