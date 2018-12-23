package io.jochimsen.cahwebservice.entity;

import javax.persistence.*;

@Entity
@Table
public class WhiteCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long whiteCardId;

    @Column
    private String text;

    public long getWhiteCardId() {
        return whiteCardId;
    }

    public void setWhiteCardId(final long whiteCardId) {
        this.whiteCardId = whiteCardId;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
