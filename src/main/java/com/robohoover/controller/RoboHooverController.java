package com.robohoover.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.robohoover.model.Coordinates;
import com.robohoover.model.RoboHooverInput;
import com.robohoover.model.RoboHooverResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoboHooverController {

    @PostMapping("/clean")
    public RoboHooverResponse greeting(@RequestBody RoboHooverInput name) {

        List<Integer> finalHooverPosition = new ArrayList<>();
        finalHooverPosition.add(1);
        finalHooverPosition.add(2);
        return new RoboHooverResponse( finalHooverPosition, 3);
    }
}