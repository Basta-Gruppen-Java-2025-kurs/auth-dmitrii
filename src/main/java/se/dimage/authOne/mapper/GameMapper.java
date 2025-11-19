package se.dimage.authOne.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import se.dimage.authOne.dto.GameRequestDTO;
import se.dimage.authOne.dto.GameResponseDTO;
import se.dimage.authOne.model.Game;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GameMapper {
    GameResponseDTO toResponseDTO(Game game);
    Game toEntity(GameRequestDTO requestDTO);
}
