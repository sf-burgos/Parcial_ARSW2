package edu.escuelaing.arsw.weatherapp.controller;

import edu.escuelaing.arsw.weatherapp.IWeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/clima")
public class WeatherController {

    @Autowired
    IWeatherServices weatherServices;

    @RequestMapping (value="/{ciudad}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeather(@PathVariable(name="ciudad") String ciudad) {
        try {
            return new ResponseEntity<>(weatherServices.getWeatherByCity(ciudad).toString(), HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>("Ha ocurrido un error", HttpStatus.BAD_REQUEST);
        }
    }


}
