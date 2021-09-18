package com.moviewiki.api.prefGenre.controller;

import com.moviewiki.api.movie.domain.Movie;
import com.moviewiki.api.movie.repository.MovieRepository;
import com.moviewiki.api.prefGenre.service.PrefGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PrefGenreController {

    @Autowired
    PrefGenreService prefGenreServiceImpl;
    @Autowired
    MovieRepository movieRepository;

    // 선호 장르 영화 추천
    @GetMapping("/prefGenre")
    public String recMovieList(Model model){
        List<Movie> recMovieList = prefGenreServiceImpl.findAll();
        model.addAttribute("recMovieList", recMovieList);
        return "readPrefGenre";
    }

}
