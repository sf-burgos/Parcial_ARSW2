package edu.escuelaing.arsw.weatherapp.cache;

import javafx.util.Pair;
import jdk.nashorn.internal.ir.CaseNode;
import org.json.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WeatherCache implements IWeatherCache {

    private Map< String, JSONObject> cache;

    public WeatherCache() {
        this.cache = new ConcurrentHashMap<String, JSONObject>();
    }

    @Override
    public void addCache(String ciudad, JSONObject info){
        Map <String, JSONObject> tuple = new HashMap<String, JSONObject>();
        cache.put(ciudad, info);


    }
    @Override
    public void updateCache(String ciudad, JSONObject info){
        Map <String, JSONObject> tuple = new HashMap<String, JSONObject>();
        cache.put(ciudad, info);


    }
    @Override
    public void deleteCache(String ciudad, JSONObject info){
        

    }
    @Override
    public Boolean ifExistAKey(String ciudad){
        return cache.containsKey(ciudad);
    }

}
