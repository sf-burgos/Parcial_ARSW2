package edu.escuelaing.arsw.weatherapp.Services.HTTPServer;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import org.springframework.stereotype.Service;

/**
 * The type Http weather.
 */
@Service
public class HTTPWeather implements IHTTPWeather {

    @Override
    public JSONObject getWeatherByCity(String city) throws UnirestException {

        HttpResponse<String> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=ed97db27e2d1d4ad5f7f64cc3e92bf8a")
                .asString();
        return new JSONObject(response.getBody());
    }
}
