package com.matereum.service;

import com.matereum.domain.ProfitResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;

@Service
public class GovernanceService {

    public ProfitResponse calculateProfit(BigDecimal currentBalance, BigDecimal balanceAtInvestmentDate, BigDecimal amountInvested) {
        return ProfitResponse.builder()
            .totalProfit(
                currentBalance.divide(balanceAtInvestmentDate, MathContext.DECIMAL128)
                    .multiply(amountInvested, MathContext.DECIMAL128)
                    .intValue())
            .build();
    }
}
