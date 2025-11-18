package se.dimage.authOne.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import se.dimage.authOne.dto.GameRequestDTO;
import se.dimage.authOne.dto.GameResponseDTO;
import se.dimage.authOne.model.Game;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface GameMapper {
    GameResponseDTO toResponseDTO(Game game);
    @Mapping(target = "id", constant = "0L")
    Game toEntity(GameRequestDTO requestDTO);
}
