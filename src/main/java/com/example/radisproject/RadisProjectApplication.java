package com.example.radisproject;

import com.example.radisproject.entity.Product;
import com.example.radisproject.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/product")

public class RadisProjectApplication {
    @Autowired

    private ProductDao dao;

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return dao.save(product);
    }
    @GetMapping
    public Iterable<Product> findAll(){
        return dao.findAll();
    }
    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id){
        return dao.findProductById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        return dao.deleteProduct(id);
    }

    public static void main(String[] args) {
        SpringApplication.run(RadisProjectApplication.class, args);
    }

}
