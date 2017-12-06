package com.lmig.gfc.wimp.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.wimp.models.Movie;
import com.lmig.gfc.wimp.repositories.MovieRepository;
import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.repositories.ActorRepository;

@Configuration
public class SeedData {

	public SeedData(ActorRepository actorRepository, MovieRepository movieRepository) {
		actorRepository.save(new Actor("Michael","Douglas", null, null));
		actorRepository.save(new Actor("Marlon","Brando", null, null));
		actorRepository.save(new Actor("Robert","DeNiro", null, null));
		actorRepository.save(new Actor("Tom","Siezmore", null, null));
		actorRepository.save(new Actor("Sam","Worthington", null, null));
		movieRepository.save(new Movie("Godfather", null, null,"MGM"));
		movieRepository.save(new Movie("Goodfellas",null, null, "Columbia"));
		movieRepository.save(new Movie("Ghostbusters",null, null, "Columbia"));
		movieRepository.save(new Movie("Stipes",null, null, "Universal"));
		movieRepository.save(new Movie("Tremors",null, null, "Fox 20th"));
	}
}
