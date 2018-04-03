package com.example.demo.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {

		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJokes() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}
	
	

}
