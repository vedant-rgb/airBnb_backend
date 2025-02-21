package com.project.AirBnbApp.strategy;

import com.project.AirBnbApp.entities.Inventory;

import java.math.BigDecimal;

public class BasePriceStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
