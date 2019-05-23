/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.khalis.training_v4.product;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Khalis
 */
//public class ProductRespository {
public interface ProductRespository extends JpaRepository<Product, Long> { 
}
