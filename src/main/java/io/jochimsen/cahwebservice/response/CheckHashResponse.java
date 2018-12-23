package io.jochimsen.cahwebservice.response;

public class CheckHashResponse {
    private final boolean isHashEqual;

    public CheckHashResponse(final boolean isHashEqual) {
        this.isHashEqual = isHashEqual;
    }

    public boolean isHashEqual() {
        return isHashEqual;
    }
}
