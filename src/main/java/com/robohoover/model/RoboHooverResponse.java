package com.robohoover.model;

import java.util.List;

public class RoboHooverResponse {

    private List<Integer> coords ;
    private Integer patches;

    public RoboHooverResponse(List<Integer> coords, Integer patches) {
        this.coords = coords;
        this.patches = patches;
    }

    public List<Integer> getCoords() {
        return coords;
    }

    public Integer getPatches() {
        return patches;
    }
}