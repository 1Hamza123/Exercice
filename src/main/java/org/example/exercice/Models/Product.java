package org.example.exercice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data
public class Product {

    int ID;
    String name;
    Double price;
}
