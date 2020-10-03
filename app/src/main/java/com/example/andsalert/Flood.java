package com.example.andsalert;




import android.location.Location;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

import java.util.Collections;

import highschool.pranav.floodmapnavigator.FloodLocation;

import static java.util.Collection.*;


public class Flood {
    private ArrayList<FloodLocation> points;
    private String country;
    private Location boundBoxMin;
    private Location boundBoxMax;

    private int alertLevel;



    private int pointsNumber;

    ArrayList<LatLng> latLngArrayList = new ArrayList<LatLng>();

    Flood(ArrayList<FloodLocation> pointsIn, String countryIn,
          Location bBMIn, Location bBMax,
          int alertLevelIn) {
        points = pointsIn;
        country = countryIn;
        boundBoxMax = bBMax;
        boundBoxMin = bBMIn;
        alertLevel = alertLevelIn;


    }


    public ArrayList<FloodLocation> getPoints() {
        return points;
    }

    public String getCountry() {
        return country;
    }

    public Location getBoundBoxMin() {
        return boundBoxMin;
    }

    public Location getBoundBoxMax() {
        return boundBoxMax;
    }

    public int getAlertLevel() {
        return alertLevel;
    }

    public int getPointsNumber() {
        return pointsNumber;
    }


    public ArrayList<LatLng> getLatLngArrayList() {
        return latLngArrayList;
    }

    public void setLatLngArrayList(ArrayList<LatLng> latLngArrayList) {
        this.latLngArrayList = latLngArrayList;
    }



    public ArrayList<LatLng> getMaxMinValues(ArrayList<FloodLocation> poinstArray, Double minLat, Double maxLat, Double minLong, Double maxLong) {
        ArrayList<LatLng> latLngArrayList = new ArrayList<LatLng>();

        ArrayList<Integer> xArrayList = new ArrayList<Integer>();
        ArrayList<Integer> yArrayList = new ArrayList<Integer>();
        for (FloodLocation point : poinstArray) {
            xArrayList.add(point.getX());
            yArrayList.add(point.getY());
        }
        int xMax = Collections.max(xArrayList);
        int xMin = Collections.min(xArrayList);
        int yMax = Collections.max(yArrayList);
        int yMin = Collections.min(yArrayList);
        int xSize = xArrayList.size();
        int ySize = yArrayList.size();
        int xDiff = xMax - xMin;
        int yDiff = yMax - yMin;
        double xScale = 360/4000.0;
        double yScale = 180/2000.0;
        //Log.v("tag", "reading xScale " + xScale);
        //Log.v("tag", "reading yScale " + yScale);

        double newLat =0;
        double newLong = 0;
//
        for(FloodLocation loc: poinstArray){
            int x = loc.getX();
            int y = loc.getY();
            double latitude = y*yScale - 90;
            double longitude = x*xScale - 180;
            LatLng llg = new LatLng(-1 *latitude, longitude);
            latLngArrayList.add(llg);
        }

        return latLngArrayList;
    }

}


