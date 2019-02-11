package io.jochimsen.cahwebservice.response;

import lombok.Value;

@Value
public class WhiteCardResponse {
    private final long whiteCardId;
    private final String text;
}
