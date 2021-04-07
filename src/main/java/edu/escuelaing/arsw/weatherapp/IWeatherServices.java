package edu.escuelaing.arsw.weatherapp;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;


/**
 * The interface Weather services.
 */
public interface IWeatherServices  {
    /**
     * Gets weather by city.
     *
     * @param city the city
     * @return the weather by city
     * @throws UnirestException the unirest exception
     */
    JSONObject getWeatherByCity(String city) throws UnirestException;
}
