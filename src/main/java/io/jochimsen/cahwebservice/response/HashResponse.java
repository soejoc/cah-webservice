package io.jochimsen.cahwebservice.response;

public class HashResponse<T> {
    private final T data;
    private final String hash;

    public HashResponse(final T data, final String hash) {
        this.data = data;
        this.hash = hash;
    }

    public T getData() {
        return data;
    }

    public String getHash() {
        return hash;
    }
}
