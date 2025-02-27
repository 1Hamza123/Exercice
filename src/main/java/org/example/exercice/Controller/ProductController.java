//package org.example.exercice.Controller;
//
//import org.example.exercice.Models.Product;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    private List<Product> products = new ArrayList<>();
//    ProductController() {
//        Product P1 =new Product(1,"Carte",120.00);
//        Product P2 =new Product(2,"Carte2",121.00);
//        Product P3 =new Product(3,"Carte3",122.00);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Product>> getProducts() {
//        // used ResponseEntity for better Returns
//        return ResponseEntity.ok(products);
//    }
//
//    @PostMapping
//    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
//        products.add(product);
//        return ResponseEntity.ok(product);
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Product> getProductByID(@PathVariable int id) {
//        return products.stream()
//                .filter(product -> product.getID() == id)
//                .findFirst()
//                .map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//}
