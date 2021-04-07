package edu.escuelaing.arsw.weatherapp.cache;

import org.json.JSONObject;

import java.util.Date;

/**
 * The interface Weather cache.
 */
public interface IWeatherCache {
    /**
     * Add cache.
     *
     * @param ciudad the ciudad
     * @param info   the info
     */
    void addCache (String ciudad, JSONObject info);

    /**
     * Gets data.
     *
     * @param name the name
     * @return the data
     */
    JSONObject getData(String name);

    /**
     * Update cache.
     *
     * @param ciudad the ciudad
     * @param info   the info
     */
    void updateCache(String ciudad, JSONObject info);

    /**
     * Delete cache.
     *
     * @param ciudad the ciudad
     */
    void deleteCache(String ciudad);

    /**
     * Gets creation date.
     *
     * @param name the name
     * @return the creation date
     */
    Date getCreationDate(String name);

    /**
     * If exist a key boolean.
     *
     * @param ciudad the ciudad
     * @return the boolean
     */
    Boolean ifExistAKey(String ciudad);
}
