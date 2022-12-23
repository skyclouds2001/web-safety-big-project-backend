package org.fly.sky.controller;

import org.fly.sky.common.Result;
import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@RestController
@RequestMapping("/scenery-spot")
@CrossOrigin
public class ScenerySpotController {

    @Autowired
    private ScenerySpotService scenerySpotService;

    @GetMapping("/{id}")
    public Result getSingleScenerySpot(@PathVariable Integer id) {
        return scenerySpotService.getById(id);
    }

    @GetMapping
    public Result getAllScenerySpot() {
        return scenerySpotService.getAll();
    }

    @PostMapping
    public Result addScenerySpot(@RequestBody ScenerySpot scenerySpot) {
        return scenerySpotService.save(scenerySpot);
    }

    @PutMapping
    public Result updateScenerySpot(@RequestBody ScenerySpot scenerySpot) {
        return scenerySpotService.update(scenerySpot);
    }

    @DeleteMapping
    public Result removeScenerySpot(@RequestParam Integer id) {
        return scenerySpotService.delete(id);
    }

}
