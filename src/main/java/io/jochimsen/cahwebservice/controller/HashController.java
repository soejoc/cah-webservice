package io.jochimsen.cahwebservice.controller;

import io.jochimsen.cahwebservice.request.CheckHashRequest;
import io.jochimsen.cahwebservice.response.CheckHashResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class HashController {

    protected abstract int getHash();

    @RequestMapping(value = "/hash", method = RequestMethod.POST)
    public CheckHashResponse checkHash(@RequestBody final CheckHashRequest checkHashRequest) {
        final int computedHash = getHash();
        final int postedHash = checkHashRequest.getHash();

        return new CheckHashResponse(computedHash == postedHash);
    }
}
