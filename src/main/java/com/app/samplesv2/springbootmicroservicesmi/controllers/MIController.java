package com.app.samplesv2.springbootmicroservicesmi.controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.samplesv2.springbootmicroservicesmi.model.Movie;

@RestController
@RequestMapping("/movies")
public class MIController {

	Logger logger = Logger.getLogger(MIController.class.getName());
	
	@RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		
		logger.info("Movie Id passed : "+movieId);
		Movie movie = new Movie(movieId,"maharshi","telugu");
		return movie;
    }

}
