package io.jochimsen.cahwebservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class BlackCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long blackCardId;

    @Column
    private String text;

    @Column
    private int blankCount;

    public long getBlackCardId() {
        return blackCardId;
    }

    public void setBlackCardId(final long blackCardId) {
        this.blackCardId = blackCardId;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public int getBlankCount() {
        return blankCount;
    }

    public void setBlankCount(final int blankCount) {
        this.blankCount = blankCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(blackCardId, text, blankCount);
    }
}
