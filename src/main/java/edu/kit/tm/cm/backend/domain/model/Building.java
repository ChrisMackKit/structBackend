package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "building")
@AllArgsConstructor
@Builder
public class Building{

    @Getter
    @Id
    @Column (name = "id")
    private int id;

    @Column (name = "name")
    private String name;

    @ManyToOne
    @Column (name = "camusId")
    private int campusId;

    @Column (name = "floors")
    private ArrayList<Floor> floors;

    @OneToMany
    @Column (name = "coordinates")
    private ArrayList<Coordinates> coordinates;
}
