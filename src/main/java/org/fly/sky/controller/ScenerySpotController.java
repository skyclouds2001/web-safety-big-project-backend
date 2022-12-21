package org.fly.sky.controller;

import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.domain.ScenerySpot;
import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        ScenerySpot scenerySpot = scenerySpotService.getById(id);
        return new Result(scenerySpot != null ? Code.SUCCESS : Code.FAILURE, scenerySpot);
    }

    @GetMapping
    public Result getAllScenerySpot() {
        List<ScenerySpot> scenerySpots = scenerySpotService.getAll();
        return new Result(scenerySpots != null ? Code.SUCCESS : Code.FAILURE, scenerySpots);
    }

    @PostMapping
    public Result addScenerySpot(@RequestBody ScenerySpot scenerySpot) {
        return new Result(scenerySpotService.save(scenerySpot) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @PutMapping
    public Result updateScenerySpot(@RequestBody ScenerySpot scenerySpot) {
        return new Result(scenerySpotService.update(scenerySpot) ? Code.SUCCESS : Code.FAILURE, null);
    }

    @DeleteMapping
    public Result removeScenerySpot(@RequestParam Integer id) {
        return new Result(scenerySpotService.delete(id) ? Code.SUCCESS : Code.FAILURE, null);
    }

}
