package edu.kit.tm.cm.backend.application.dtos;

import org.mapstruct.Mapper;
import edu.kit.tm.cm.backend.application.dtos.response.BuildingResponse;
import edu.kit.tm.cm.backend.application.dtos.service.BuildingDto;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BuildingMapper {
    BuildingResponse toResponse(BuildingDto buildingDto);
    List<BuildingResponse> toResponseList(List<BuildingDto> buildingDtos);
}
