package io.jochimsen.cahwebservice.response;

public class WhiteCardResponse {
    private final long whiteCardId;
    private final String text;

    public WhiteCardResponse(final long whiteCardId, final String text) {
        this.whiteCardId = whiteCardId;
        this.text = text;
    }

    public long getWhiteCardId() {
        return whiteCardId;
    }

    public String getText() {
        return text;
    }
}
