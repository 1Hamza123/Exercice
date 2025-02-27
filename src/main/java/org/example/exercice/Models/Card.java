package org.example.exercice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Card {
    Long id;
    String holderName;
    Date expirationDate;


}