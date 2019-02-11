package io.jochimsen.cahwebservice.response;

import lombok.Value;

@Value
public class BlackCardResponse {
    private final long blackCardId;
    private final String text;
    private final int blankCount;
}
