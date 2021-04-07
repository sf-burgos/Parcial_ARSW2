package edu.escuelaing.arsw.weatherapp;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;


public interface IWeatherServices  {
    JSONObject getWeatherByCity(String city) throws UnirestException;
}
