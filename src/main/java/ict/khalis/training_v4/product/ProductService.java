/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.khalis.training_v4.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Khalis
 */

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRespository productRespository;

    public List<Product> findAll() {
        return productRespository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRespository.findById(id);
    }

    public Product save(Product stock) {
        return productRespository.save(stock);
    }

    public void deleteById(Long id) {
        productRespository.deleteById(id);
    }
}
