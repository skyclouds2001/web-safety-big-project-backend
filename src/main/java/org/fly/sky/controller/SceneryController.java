package org.fly.sky.controller;

import org.fly.sky.service.ScenerySpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SceneryController {

    @Autowired
    private ScenerySpotService scenerySpotService;

}
