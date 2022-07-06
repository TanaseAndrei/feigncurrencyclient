package com.learnfeignclient.client.infrastructure;

import com.learnfeignclient.client.controller.AmountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "${feign.client.name}", url = "${feign.client.targetUrl}")
public interface CurrencyService {

    @GetMapping("${feign.client.conversionEndpoint}")
    AmountResponse convert(@RequestParam("from") String from, @RequestParam("to") String to,
                           @RequestParam("amount") BigDecimal amount);
}
