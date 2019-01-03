package edu.kit.tm.cm.backend.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import edu.kit.tm.cm.backend.application.controllers.Api.BackendApi;
import edu.kit.tm.cm.backend.application.dtos.BuildingMapper;
import edu.kit.tm.cm.backend.application.dtos.service.BuildingDto;
import edu.kit.tm.cm.backend.application.services.BackendService;

@RestController
public class BackendController {
    private BackendService backendService;
    private BuildingMapper buildingMapper;

    @Autowired
    public BackendController(BackendService backendService, BuildingMapper buildingMapper) {
        this.buildingMapper = buildingMapper;
        this.backendService = backendService;
    }

    public Object[] getBuildings() {
        BuildingDto buildingDto = new BuildingDto() {
            @Override
            public int getId() {
                return 3;
            }

            @Override
            public String getName() {
                return "my first test";
            }

            @Override
            public String getDescription() {
                return "a boaring test";
            }
        };
        Object[] a = {buildingMapper.toResponse(buildingDto)};
        return a;
    }
}
