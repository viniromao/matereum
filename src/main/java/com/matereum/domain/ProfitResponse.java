package com.matereum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProfitResponse {

    @JsonProperty("total_profit")
    private Integer totalProfit;
}
