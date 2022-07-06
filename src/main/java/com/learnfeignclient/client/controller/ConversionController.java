package com.learnfeignclient.client.controller;

import com.learnfeignclient.client.infrastructure.CurrencyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping
@AllArgsConstructor
public class ConversionController {

    private final CurrencyService currencyService;

    @GetMapping("/convert")
    public AmountResponse convert(@RequestParam("from") String from, @RequestParam("to") String to,
                                  @RequestParam("amount") BigDecimal amount) {
        return currencyService.convert(from, to, amount);
    }
}
