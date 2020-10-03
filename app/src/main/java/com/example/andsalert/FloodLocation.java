package com.example.andsalert;

package highschool.pranav.floodmapnavigator;





public class FloodLocation {

    private int x;
    private int y;
    private String coordinatesType;
    private String valid;

    public FloodLocation(int x, int y, String coordinatesType, String valid) {
        this.x = x;
        this.y = y;
        this.coordinatesType = coordinatesType;
        this.valid = valid;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCoordinatesType() {
        return coordinatesType;
    }

    public String isValid() {
        return valid;
    }

}

