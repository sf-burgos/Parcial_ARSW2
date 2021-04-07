package edu.escuelaing.arsw.weatherapp.Services.HTTPServer;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 * The interface Ihttp weather.
 */
public interface IHTTPWeather {
    /**
     * Gets weather by city.
     *
     * @param city the city
     * @return the weather by city
     * @throws UnirestException the unirest exception
     */
    JSONObject getWeatherByCity(String city) throws UnirestException;
}
