package io.jochimsen.cahwebservice.response;

import lombok.Value;

@Value
public class CheckHashResponse {
    private final boolean isHashEqual;
}
