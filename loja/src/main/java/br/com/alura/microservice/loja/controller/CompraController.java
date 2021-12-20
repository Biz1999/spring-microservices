package br.com.alura.microservice.loja.controller;


import br.com.alura.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.alura.microservice.loja.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraController {

  @Autowired
  private CompraService compraService;
  
  @PostMapping
  public void realizaCompra(@RequestBody CompraDTO compra) {
    compraService.realizaCompra(compra);
  }
}
