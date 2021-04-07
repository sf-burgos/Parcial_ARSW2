package edu.escuelaing.arsw.weatherapp.Services;


import com.mashape.unirest.http.exceptions.UnirestException;
import edu.escuelaing.arsw.weatherapp.IWeatherServices;
import edu.escuelaing.arsw.weatherapp.Services.HTTPServer.IHTTPWeather;
import edu.escuelaing.arsw.weatherapp.cache.IWeatherCache;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * The type Weather services.
 */
@Service
public class WeatherServices implements IWeatherServices {

    /**
     * The Http weather.
     */
    @Autowired
    IHTTPWeather httpWeather;

    /**
     * The Cache.
     */
    @Autowired
    IWeatherCache cache;

    private final String cacheGeneral = "clima";
    private final String cacheCiudad = "ciudad";

    @Override
    public JSONObject getWeatherByCity(String city)  throws UnirestException {
        if (!cache.ifExistAKey(cacheCiudad) || new Date().getTime() - cache.getCreationDate(cacheGeneral).getTime() >= 30000)
            cache.updateCache(city, httpWeather.getWeatherByCity(city));
            return cache.getData(city);

    }
}
