package se.dimage.authOne.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.dimage.authOne.dto.GameRequestDTO;
import se.dimage.authOne.dto.GameResponseDTO;
import se.dimage.authOne.exception.ResourceNotFoundException;
import se.dimage.authOne.mapper.GameMapper;
import se.dimage.authOne.repository.GameRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository repository;
    private final GameMapper mapper;

    public List<GameResponseDTO> listAll() {
        return repository.findAll().stream().map(mapper::toResponseDTO).toList();
    }

    public GameResponseDTO findById(Long id) throws ResourceNotFoundException {
        return repository.findById(id).map(mapper::toResponseDTO).orElseThrow(ResourceNotFoundException::new);
    }

    public GameResponseDTO addGame(GameRequestDTO requestDTO) {
        return mapper.toResponseDTO(repository.save(mapper.toEntity(requestDTO)));
    }
}
