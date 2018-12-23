package io.jochimsen.cahwebservice.controller;

import io.jochimsen.cahwebservice.request.CheckHashRequest;
import io.jochimsen.cahwebservice.response.CheckHashResponse;
import io.jochimsen.cahwebservice.response.HashResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class HashController {

    @RequestMapping(value = "/hash", method = RequestMethod.GET)
    public abstract HashResponse getHash();

    @RequestMapping(value = "/hash", method = RequestMethod.POST)
    public CheckHashResponse checkHash(@RequestBody final CheckHashRequest checkHashRequest) {
        final String computedHash = getHash().getHash();
        final String postedHash = checkHashRequest.getHash();

        final CheckHashResponse checkHashResponse = new CheckHashResponse(computedHash.equals(postedHash));
        return checkHashResponse;
    }
}
