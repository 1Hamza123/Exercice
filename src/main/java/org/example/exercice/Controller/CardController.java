package org.example.exercice.Controller;

import org.example.exercice.Models.Card;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
    public List<Card> getAllCards() {

        return cards;
    }

    @PostMapping
    public Card addCard(@RequestBody Card card) {
        if(card == null) return null;
        cards.add(card);
        return card;
    }


    @PutMapping("/{id}")
    public Card updateCard(@PathVariable Long id, @RequestBody Card updatedCard) {
        return cards.stream()
                .filter(card -> card.getId().equals(id))
                .findFirst()
                .map(card -> {
                    card.setHolderName(updatedCard.getHolderName());
                    card.setExpirationDate(updatedCard.getExpirationDate());
                    return updatedCard;
                })
                .orElse(null);
    }
    @DeleteMapping("/{id}")
    public Boolean removeCard(@PathVariable("id") Long id){
        return cards.stream()
                .filter(c->c.getId().equals(id) )
                .findFirst()
                .map(card -> {
                    cards.remove(card);
                    return true;
                })
                .orElse(false);
    }

}
