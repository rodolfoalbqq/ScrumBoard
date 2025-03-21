package ScrumBoard.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Column {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int orderIndex;

    @Enumerated(EnumType.STRING)
    private ColumnType type;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public enum ColumnType {
        INITIAL, PENDING, FINAL, CANCELLED;
    }
}

