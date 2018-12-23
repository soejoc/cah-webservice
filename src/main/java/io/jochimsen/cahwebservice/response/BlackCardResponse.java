package io.jochimsen.cahwebservice.response;

public class BlackCardResponse {
    private final long blackCardId;
    private final String text;
    private final int blankCount;

    public BlackCardResponse(final long blackCardId, final String text, final int blankCount) {
        this.blackCardId = blackCardId;
        this.text = text;
        this.blankCount = blankCount;
    }

    public long getBlackCardId() {
        return blackCardId;
    }

    public String getText() {
        return text;
    }

    public int getBlankCount() {
        return blankCount;
    }
}
