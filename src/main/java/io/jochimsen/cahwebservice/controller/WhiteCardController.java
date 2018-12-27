package io.jochimsen.cahwebservice.controller;

import io.jochimsen.cahwebservice.entity.WhiteCard;
import io.jochimsen.cahwebservice.response.HashResponse;
import io.jochimsen.cahwebservice.response.WhiteCardResponse;
import io.jochimsen.cahwebservice.repository.WhiteCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/whiteCard")
public class WhiteCardController extends HashController {

    @Autowired
    private WhiteCardRepository whiteCardRepository;

    @RequestMapping(method = RequestMethod.GET)
    public HashResponse<List<WhiteCardResponse>> getWhiteCards() {
        final List<WhiteCard> whiteCards = whiteCardRepository.findAll();

        final List<WhiteCardResponse> whiteCardsResponse = whiteCards.stream()
                .map(whiteCard -> new WhiteCardResponse(whiteCard.getWhiteCardId(), whiteCard.getText()))
                .collect(Collectors.toList());

        final int hash = whiteCards.hashCode();

        return new HashResponse<>(whiteCardsResponse, hash);
    }

    @Override
    public int getHash() {
        final List<WhiteCard> whiteCards = whiteCardRepository.findAll();
        return whiteCards.hashCode();
    }
}
