package edu.kit.tm.cm.backend.domain.model;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
public class Beacon {

    @Getter
    private int id;

    private String name;

    private String description;
}
