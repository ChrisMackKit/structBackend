package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "floor")
@AllArgsConstructor
@Builder
public class Floor {

    @Getter
    @Id
    @Column(name = "id")
    private int id;

    @Column (name = "name")
    private String name;

    @ManyToOne
    @Column (name = "buildingId")
    private int buildingId;

    @ManyToOne
    @Column (name = "camusId")
    private int campusId;

    //Number of the floor basically
    @Column (name = "z")
    private int z;
}