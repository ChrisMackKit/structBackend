package edu.kit.tm.cm.backend.domain.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Position {

    @Getter
    private Coordinates coordinates;
    /**
     * Or
    *private int x;
    *
    *private int y;
     */

}
