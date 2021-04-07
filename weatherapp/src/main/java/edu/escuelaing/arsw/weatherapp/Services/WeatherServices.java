package edu.escuelaing.arsw.weatherapp.Services;


import com.mashape.unirest.http.exceptions.UnirestException;
import edu.escuelaing.arsw.weatherapp.IWeatherServices;
import edu.escuelaing.arsw.weatherapp.Services.HTTPServer.IHTTPWeather;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherServices implements IWeatherServices {

    @Autowired
    IHTTPWeather httpWeather;

    @Override
    public JSONObject getWeatherByCity(String city)  throws UnirestException {
        return httpWeather.getWeatherByCity(city);
    }
}
