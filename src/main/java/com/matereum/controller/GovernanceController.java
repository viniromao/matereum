package com.matereum.controller;

import com.matereum.domain.ProfitRequest;
import com.matereum.domain.ProfitResponse;
import com.matereum.service.GovernanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequestMapping("/governance")
public class GovernanceController {

    @Autowired
    private GovernanceService governanceService;

    @PostMapping("/investment-profit")
    public ResponseEntity<ProfitResponse> calculateProfit(@RequestBody ProfitRequest profitRequest){
        log.info("Request to calculateProfit with ProfitRequest: {}", profitRequest);

        ProfitResponse profitResponse = governanceService.calculateProfit(profitRequest.getCurrentBalance(),
            profitRequest.getBalanceAtInvestmentDate(),
            profitRequest.getAmountInvested());

        log.info("Calculate profit result: {}", profitResponse.getTotalProfit());

        return ResponseEntity.status(HttpStatus.OK).body(profitResponse);
    }
}
