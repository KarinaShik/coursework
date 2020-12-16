package com.interiorClock.website.controllers;

import com.interiorClock.website.entities.ClockEntity;
import com.interiorClock.website.repo.ClockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/clocks",
                produces = "application/json",
                method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClockController {

    @Autowired
    ClockRepository clockRepository;

    @GetMapping("/get-all-clocks")
    public List<ClockEntity> getAllClocks() {

        List<ClockEntity> clocks = clockRepository.findAll();
        return clocks;
    }

    @GetMapping("/get-clock/{id}")
    public ClockEntity getClockId(@PathVariable(value = "id") Integer clockId) {

        ClockEntity clock = clockRepository.findById(clockId).get();
        return clock;
    }

    @PostMapping("/create-clock")
    public ClockEntity addClock(@RequestBody ClockEntity clock) {

        ClockEntity newClock = clockRepository.save(clock);
        return newClock;
    }

    @PutMapping("/update-clock/{id}")
    public ResponseEntity<ClockEntity> updateClock(@PathVariable(value = "id") Integer clockId,
                                                   @RequestBody ClockEntity clock) {
        ClockEntity updClock = clockRepository.findById(clockId).get();

        updClock.setTitle(clock.getTitle());
        updClock.setCategory(clock.getCategory());
        updClock.setDescription(clock.getDescription());
        updClock.setPrice(clock.getPrice());
        updClock.setMovement(clock.getMovement());
        updClock.setMaterial(clock.getMaterial());
        updClock.setDimensions(clock.getDimensions());
        updClock.setWeight(clock.getWeight());
        updClock.setImgRef(clock.getImgRef());
        updClock.setOtherInfo(clock.getOtherInfo());

        final ClockEntity updatedClock = clockRepository.save(updClock);
        return ResponseEntity.ok(updatedClock);
    }

    @DeleteMapping("/delete-clock/{id}")
    public Map<String, Boolean> deleteClock(@PathVariable(value = "id") Integer clockId) {

        ClockEntity clock = clockRepository.findById(clockId).get();
        clockRepository.delete(clock);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
