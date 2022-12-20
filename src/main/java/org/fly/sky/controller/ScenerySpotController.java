package org.fly.sky.controller;

import org.fly.sky.common.RequestCode;
import org.fly.sky.common.RequestResult;
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
    public RequestResult getSingleScenerySpot(@PathVariable Integer id) {
        ScenerySpot scenerySpot = scenerySpotService.getById(id);
        return new RequestResult(scenerySpot != null ? RequestCode.SUCCESS : RequestCode.FAILURE, scenerySpot);
    }

    @GetMapping
    public RequestResult getAllScenerySpot() {
        List<ScenerySpot> scenerySpots = scenerySpotService.getAll();
        return new RequestResult(scenerySpots != null ? RequestCode.SUCCESS : RequestCode.FAILURE, scenerySpots);
    }

    @PostMapping
    public RequestResult addScenerySpot(@RequestBody ScenerySpot scenerySpot) {
        return new RequestResult(scenerySpotService.save(scenerySpot) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @PutMapping
    public RequestResult updateScenerySpot(@RequestBody ScenerySpot scenerySpot) {
        return new RequestResult(scenerySpotService.update(scenerySpot) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

    @DeleteMapping
    public RequestResult removeScenerySpot(@RequestParam Integer id) {
        return new RequestResult(scenerySpotService.delete(id) ? RequestCode.SUCCESS : RequestCode.FAILURE, null);
    }

}
