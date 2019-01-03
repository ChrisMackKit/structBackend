package edu.kit.tm.cm.backend.application.controllers.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Api(tags = "building", description = "This is only a test route")
public interface BackendApi {
    @GetMapping
    @ApiOperation(value = "Finds all buildings")
    Object[] getBuilding();
}
