
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryOutOfStockMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryOutOfStockMessageBuilder builder) {
        InventoryEntryOutOfStockMessage inventoryEntryOutOfStockMessage = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryOutOfStockMessage).isInstanceOf(InventoryEntryOutOfStockMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntryOutOfStockMessage.builder().sku("sku") },
                new Object[] { "supplyChannel", InventoryEntryOutOfStockMessage.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntryOutOfStockMessage value = InventoryEntryOutOfStockMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void supplyChannel() {
        InventoryEntryOutOfStockMessage value = InventoryEntryOutOfStockMessage.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
