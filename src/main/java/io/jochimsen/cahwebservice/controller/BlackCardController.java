package io.jochimsen.cahwebservice.controller;

import io.jochimsen.cahwebservice.entity.BlackCard;
import io.jochimsen.cahwebservice.repository.BlackCardRepository;
import io.jochimsen.cahwebservice.response.BlackCardResponse;
import io.jochimsen.cahwebservice.response.HashResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/blackCard")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class BlackCardController extends HashController {

    private final BlackCardRepository blackCardRepository;

    @RequestMapping(method = RequestMethod.GET)
    public HashResponse<List<BlackCardResponse>> getBlackCards() {
        final List<BlackCard> blackCards = blackCardRepository.findAll();

        final List<BlackCardResponse> blackCardsResponse = blackCards.stream()
                .map(blackCard -> new BlackCardResponse(blackCard.getBlackCardId(), blackCard.getText(),  blackCard.getBlankCount()))
                .collect(Collectors.toList());

        final int hash = blackCards.hashCode();

        return new HashResponse<>(blackCardsResponse, hash);
    }

    @Override
    public int getHash() {
        final List<BlackCard> blackCards = blackCardRepository.findAll();
        return blackCards.hashCode();
    }
}
