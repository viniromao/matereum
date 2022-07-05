package com.matereum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProfitRequest {

    @JsonProperty("current_balance")
    private BigDecimal currentBalance;

    @JsonProperty("balance_at_investment_date")
    private BigDecimal balanceAtInvestmentDate;

    @JsonProperty("amount_invested")
    private BigDecimal amountInvested;
}
