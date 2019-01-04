package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "POI")
@AllArgsConstructor
@Builder
public class POI {


    @Getter
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
    private ArrayList<Coordinates> door;

    @OneToMany
    @Column (name = "coordinates")
    private ArrayList<Coordinates> coordinates;
}
