
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySafetyStockMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySafetyStockMessagePayloadBuilder builder) {
        InventoryEntrySafetyStockMessagePayload inventoryEntrySafetyStockMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySafetyStockMessagePayload)
                .isInstanceOf(InventoryEntrySafetyStockMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntrySafetyStockMessagePayload.builder().sku("sku") },
                new Object[] { "quantityOnStock",
                        InventoryEntrySafetyStockMessagePayload.builder().quantityOnStock(2) },
                new Object[] { "supplyChannel", InventoryEntrySafetyStockMessagePayload.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntrySafetyStockMessagePayload value = InventoryEntrySafetyStockMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantityOnStock() {
        InventoryEntrySafetyStockMessagePayload value = InventoryEntrySafetyStockMessagePayload.of();
        value.setQuantityOnStock(2);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2);
    }

    @Test
    public void supplyChannel() {
        InventoryEntrySafetyStockMessagePayload value = InventoryEntrySafetyStockMessagePayload.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
