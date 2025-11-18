package se.dimage.authOne.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.dimage.authOne.dto.GameResponseDTO;
import se.dimage.authOne.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
@Validated
public class GameController {

    private final GameService service;

    @GetMapping
    public ResponseEntity<List<GameResponseDTO>> listAllGames() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
