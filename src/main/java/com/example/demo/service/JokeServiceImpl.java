package com.example.demo.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	@Override
	public String getJokes() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}
	
	public JokeServiceImpl() {

		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

}
