
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryOutOfStockMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryOutOfStockMessagePayloadBuilder builder) {
        InventoryEntryOutOfStockMessagePayload inventoryEntryOutOfStockMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryOutOfStockMessagePayload)
                .isInstanceOf(InventoryEntryOutOfStockMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntryOutOfStockMessagePayload.builder().sku("sku") },
                new Object[] { "supplyChannel", InventoryEntryOutOfStockMessagePayload.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntryOutOfStockMessagePayload value = InventoryEntryOutOfStockMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void supplyChannel() {
        InventoryEntryOutOfStockMessagePayload value = InventoryEntryOutOfStockMessagePayload.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
