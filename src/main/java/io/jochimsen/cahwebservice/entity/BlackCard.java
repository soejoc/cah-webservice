package io.jochimsen.cahwebservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Data
public class BlackCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long blackCardId;

    @Column
    private String text;

    @Column
    private int blankCount;
}
