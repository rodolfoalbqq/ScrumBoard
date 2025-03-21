package ScrumBoard.Repository;

import ScrumBoard.Entidades.Board;;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}