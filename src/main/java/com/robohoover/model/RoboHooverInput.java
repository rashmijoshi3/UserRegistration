package com.robohoover.model;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class RoboHooverInput {
    private List<Integer> roomSize;
    private List<Integer> hooverPosition;
    private List<List<Integer>> patches;
    private String instructions;


    public List<Integer> getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(List<Integer> roomSize) {
        this.roomSize = roomSize;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Integer> getHooverPosition() {
        return hooverPosition;
    }

    public void setHooverPosition(List<Integer> hooverPosition) {
        this.hooverPosition = hooverPosition;
    }

    public List<List<Integer>> getPatches() {
        return patches;
    }

    public void setPatches(List<List<Integer>> patches) {
        this.patches = patches;
    }
}
