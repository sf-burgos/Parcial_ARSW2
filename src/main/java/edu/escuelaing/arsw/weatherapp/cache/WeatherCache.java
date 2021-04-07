package edu.escuelaing.arsw.weatherapp.cache;

import org.javatuples.Pair;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Weather cache.
 */
@Service
public class WeatherCache implements IWeatherCache {

    private Map< String, Pair<Date, JSONObject> > cache;

    /**
     * Instantiates a new Weather cache.
     */
    public WeatherCache() {
        this.cache = new ConcurrentHashMap<String,Pair<Date,JSONObject>>();
    }

    @Override
    public void addCache(String name, JSONObject info){

        Pair<Date, JSONObject > tuple = new Pair<Date, JSONObject> (new Date(), info);
        cache.put(name, tuple);

    }
    @Override
    public JSONObject getData(String name){
        return cache.get(name).getValue1();

    }
    @Override
    public void updateCache(String name, JSONObject info){
        Pair<Date, JSONObject > tuple = new Pair<Date, JSONObject> (new Date(), info);
        cache.put(name, tuple);


    }


    @Override
    public void deleteCache(String ciudad){
        cache.remove(ciudad);
    }

    @Override
    public Date getCreationDate(String name){
        return cache.get(name).getValue0();

    }

    @Override
    public Boolean ifExistAKey(String ciudad){
        return cache.containsKey(ciudad);
    }

}
