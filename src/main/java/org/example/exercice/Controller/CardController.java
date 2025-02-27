package org.example.exercice.Controller;

import org.example.exercice.Models.Card;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    private final List<Card> cards = new ArrayList<>();

    public CardController() {
        cards.add(new Card(1L, "Hamza", new Date()));
        cards.add(new Card(2L, "Amine", new Date()));
        cards.add(new Card(3L, "Test", new Date()));
    }

    @GetMapping
    public List<Card> getCards() {
        return cards;
    }

    @PostMapping
    public Card addCard(@RequestBody Card card) {
        if(card == null) return null;
        cards.add(card);
        return card;
    }
}
