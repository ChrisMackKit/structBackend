
package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


/**
 * Coordinates: (x,y) == (longitude, latitude)
 * (x,y) = (0,0) --> top left corner
 * (lon, lat) = (0,0) --> bottom left corner
 * So X and longitude point in the same direction
 * Y and latitude point in different directions. Y down and Lat up (at least in the north part of the globe)
 */


@Entity
@AllArgsConstructor
@Builder
@Getter
public class Coordinates {


    @Setter
    private double[] xy = new double[2];
    //Setter for x coordinate
    public void setX(double x) {
        this.xy[0] = x;
    }
    //Setter for y coordinate
    public void setY(double y) {
        this.xy[1] = y;
    }

}