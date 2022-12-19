package org.fly.sky.controller;

import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scenery-spot")
public class ScenerySpotController {

    @Autowired
    private ScenerySpotService scenerySpotService;

    @GetMapping("/{id}")
    public ScenerySpot getSingleScenerySpot(@PathVariable Integer id) {
        return scenerySpotService.getById(id);
    }

    @GetMapping
    public List<ScenerySpot> getAllScenerySpot() {
        return scenerySpotService.getAll();
    }

    @PostMapping
    public boolean addScenerySpot(ScenerySpot scenerySpot) {
        return scenerySpotService.save(scenerySpot);
    }

    @PutMapping
    public boolean updateScenerySpot(ScenerySpot scenerySpot) {
        return scenerySpotService.update(scenerySpot);
    }

    @DeleteMapping
    public boolean removeScenerySpot(Integer id) {
        return scenerySpotService.delete(id);
    }

}
