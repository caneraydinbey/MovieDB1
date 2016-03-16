package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Order;

/**
 * Created by caneraydin on 15.03.2016.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;


    @RequestMapping("/home")
    public String home(){
        System.out.println("moviecontroller homeda");
        return "index";
    }

    @RequestMapping("/add")
    public String add(){
        System.out.println("moviecontroller addeda");
        Movie movie = new Movie("Scarface","AlPacino");
        movieRepository.save(movie);
        return "added";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "UserManagement";
    }

}
