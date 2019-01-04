package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "beacon")
@AllArgsConstructor
@Builder
public class Beacon {

    @Getter
    @Id
    @Column (name = "id")
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

    @Column (name = "coordinates")
    private Coordinates coordinates;
}
