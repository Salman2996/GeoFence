package com.salman.geofence;

/**
 * Created by Salman2996 on 7/17/2017.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */

/* TODO :
 *   Make this class a launcher class.
 *   Generate a xml for this class with elements to enter name, latitude, longitude and radius of fence.
 *   Get the data from these elements and add it to the hashmap.
 *
 *   Add functionality that allows user to select location on the map.
 * */

final class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km

    static HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<>();

    static {
        BAY_AREA_LANDMARKS.put("GINSERV", new LatLng(12.96262,77.6467603));
        BAY_AREA_LANDMARKS.put("LEELA", new LatLng(12.960146,77.6463073));
    }
}