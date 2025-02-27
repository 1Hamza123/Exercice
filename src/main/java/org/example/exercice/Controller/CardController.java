package org.example.exercice.Controller;


import org.example.exercice.Models.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController("/card")
public class CardController {

    private List<Card> cards= Stream.of(
            new Card(1L,"hamza", new Date()),
            new Card(2L,"Amine",new Date())
    ).collect(Collectors.toList());

    @GetMapping
    public List<Card> getCards(){
        return cards;
    }

    @PostMapping
    public Card addCard(@RequestBody Card card) {
        cards.add(card);
        return card;
    }

}
