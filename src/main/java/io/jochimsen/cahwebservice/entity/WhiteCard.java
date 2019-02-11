package io.jochimsen.cahwebservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Data
public class WhiteCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long whiteCardId;

    @Column
    private String text;
}
