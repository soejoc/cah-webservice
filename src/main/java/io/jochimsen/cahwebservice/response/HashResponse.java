package io.jochimsen.cahwebservice.response;

public class HashResponse<T> {
    private final T data;
    private final int hash;

    public HashResponse(final T data, final int hash) {
        this.data = data;
        this.hash = hash;
    }

    public T getData() {
        return data;
    }

    public int getHash() {
        return hash;
    }
}
