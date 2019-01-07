package edu.kit.tm.cm.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
@AllArgsConstructor
@Builder
@Getter
public class Rssi {

    private String beaconName;

    private int rssi;
}