
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySafetyStockMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySafetyStockMessageBuilder builder) {
        InventoryEntrySafetyStockMessage inventoryEntrySafetyStockMessage = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySafetyStockMessage).isInstanceOf(InventoryEntrySafetyStockMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntrySafetyStockMessage.builder().sku("sku") },
                new Object[] { "quantityOnStock", InventoryEntrySafetyStockMessage.builder().quantityOnStock(2) },
                new Object[] { "supplyChannel", InventoryEntrySafetyStockMessage.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntrySafetyStockMessage value = InventoryEntrySafetyStockMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantityOnStock() {
        InventoryEntrySafetyStockMessage value = InventoryEntrySafetyStockMessage.of();
        value.setQuantityOnStock(2);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2);
    }

    @Test
    public void supplyChannel() {
        InventoryEntrySafetyStockMessage value = InventoryEntrySafetyStockMessage.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
