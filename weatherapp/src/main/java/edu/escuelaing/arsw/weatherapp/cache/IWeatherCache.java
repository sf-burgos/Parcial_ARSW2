package edu.escuelaing.arsw.weatherapp.cache;

import org.json.JSONObject;

public interface IWeatherCache {
    void addCache (String ciudad, JSONObject info);

    void updateCache(String ciudad, JSONObject info);

    void deleteCache(String ciudad, JSONObject info);

    Boolean ifExistAKey(String ciudad);
}
