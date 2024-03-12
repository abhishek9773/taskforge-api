package com.api.taskforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.taskforge.model.Product;
import com.api.taskforge.service.ProductService;

public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping("/saveProduct")
  public ResponseEntity<?> saveProduct(@RequestBody Product product) {

    return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);

  }

  @GetMapping("/")
  public ResponseEntity<?> getAllProduct() {
    return new ResponseEntity<>(productService.getallproduct(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getproductById(@PathVariable Integer id) {
    return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
  }

  @GetMapping("/deleteProduct/{id}")
  public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {

    return new ResponseEntity<>(productService.deleteproduct(id), HttpStatus.OK);
  }

  @PostMapping("/editProduct")
  public ResponseEntity<?> editProduct(@RequestBody Product product) {
    return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
  }

}
