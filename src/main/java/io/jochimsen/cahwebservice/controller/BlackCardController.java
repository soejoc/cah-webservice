package io.jochimsen.cahwebservice.controller;

import io.jochimsen.cahwebservice.request.CheckHashRequest;
import io.jochimsen.cahwebservice.response.BlackCardResponse;
import io.jochimsen.cahwebservice.response.CheckHashResponse;
import io.jochimsen.cahwebservice.response.HashResponse;
import io.jochimsen.cahwebservice.repository.BlackCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/blackCard")
public class BlackCardController extends HashController {

    @Autowired
    private BlackCardRepository blackCardRepository;

    @RequestMapping(method = RequestMethod.GET)
    public HashResponse<List<BlackCardResponse>> getBlackCards() {
        final List<BlackCardResponse> blackCards =  blackCardRepository.findAll().stream()
                .map(blackCard -> new BlackCardResponse(blackCard.getBlackCardId(), blackCard.getText(),  blackCard.getBlankCount()))
                .collect(Collectors.toList());

        final String hash = getHash();

        return new HashResponse<>(blackCards, hash);
    }

    @Override
    public String getHash() {
        //ToDo: Add hash computation in a way that the same data produces always the same hash

        final String hash = "blup";
        return hash;
    }
}
