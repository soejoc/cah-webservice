package io.jochimsen.cahwebservice.response;

public class HashResponse {
    private final String hash;

    public HashResponse(final String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }
}
