package se.dimage.authOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.dimage.authOne.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
