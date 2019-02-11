package io.jochimsen.cahwebservice.response;

import lombok.Value;

@Value
public class HashResponse<T> {
    private final T data;
    private final int hash;
}
