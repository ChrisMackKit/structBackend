
package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import  edu.kit.tm.cm.backend.domain.model.Building;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "POI")
@AllArgsConstructor
@Builder
@Getter
public class POI {


    @Id
    @Column(name = "id")
    private int id;

    @Column (name ="title")
    private String title;

    //Not sure what the difference between title and identifier is but the GeoJson from the examples had both
    @Column (name ="identifier")
    private String identifier;

    //same with poiId and Id
    @Column (name ="poiId")
    private int poiId;

    @ManyToOne
    @Column (name ="floorId")
    private int floorId;

    @Column (name ="zLevel")
    private int zLevel;

    @Column (name ="buildingName")
    private String buildingName;

    @Column (name ="description")
    private String description;

    @OneToMany
    @Column (name =  "doors")
    private double[] door;

    @OneToMany
    @Column (name = "coordinates")
    private ArrayList<Coordinates> coordinates;

    //About the kind of poi it is. Office, Hallway, toilets. We could add Beacons to poi and make "Beacon" a name.
    @Column (name = "names")
    private ArrayList<String> names;

    //uses function intoMeter (Building) for whole list
    public ArrayList<Coordinates> newList(ArrayList<Coordinates> coordinatesRoom, ArrayList<Coordinates> coordinatesBuilding) {
        Coordinates zero = Building.findZero(coordinatesBuilding);
        ArrayList<Coordinates> newCoords = new ArrayList<Coordinates>();
        for (int j = 0; j < coordinatesRoom.size(); j++) {
            newCoords.add(j, Building.intoMeter(coordinatesRoom.get(j), zero));

        }
        return newCoords;
    }

}