package com.project.AirBnbApp.strategy;

import com.project.AirBnbApp.entities.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
