package edu.escuelaing.arsw.weatherapp.Services.HTTPServer;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface IHTTPWeather {
    JSONObject getWeatherByCity(String city) throws UnirestException;
}
