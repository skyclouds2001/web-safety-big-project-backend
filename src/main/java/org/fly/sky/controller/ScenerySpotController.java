package org.fly.sky.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "scenery-spot", description = "景点接口")
@RestController
@RequestMapping("/scenery-spot")
@CrossOrigin
public class ScenerySpotController {

    @Autowired
    private ScenerySpotService scenerySpotService;

    @Operation(summary = "根据ID获取景点信息")
    @GetMapping("/{id}")
    public Result getSingleScenerySpot(@Parameter(description = "景点ID") @PathVariable Integer id) {
        return scenerySpotService.getById(id);
    }

    @Operation(summary = "获取全部景点信息")
    @GetMapping
    public Result getAllScenerySpot() {
        return scenerySpotService.getAll();
    }

    @Operation(summary = "添加景点")
    @PostMapping
    public Result addScenerySpot(@Parameter(description = "景点信息") @RequestBody ScenerySpot scenerySpot) {
        return scenerySpotService.save(scenerySpot);
    }

    @Operation(summary = "更新景点")
    @PutMapping
    public Result updateScenerySpot(@Parameter(description = "景点信息") @RequestBody ScenerySpot scenerySpot) {
        return scenerySpotService.update(scenerySpot);
    }

    @Operation(summary = "移除景点")
    @DeleteMapping
    public Result removeScenerySpot(@Parameter(description = "景点ID") @RequestParam Integer id) {
        return scenerySpotService.delete(id);
    }

}
