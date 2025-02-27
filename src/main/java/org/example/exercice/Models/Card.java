package org.example.exercice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
public class Card {
    Long id;
    String holderName;
    Date expirationDate;

    public Card(Long id, String holderName, Date expirationDate) {
        this.id = id;
        this.holderName = holderName;
        this.expirationDate = expirationDate;
    }
    public Card(){}
}