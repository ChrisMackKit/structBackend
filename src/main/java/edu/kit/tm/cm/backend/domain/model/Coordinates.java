package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Builder
public class Coordinates {

    @Getter
    private int[] xy = new int[2];
}
