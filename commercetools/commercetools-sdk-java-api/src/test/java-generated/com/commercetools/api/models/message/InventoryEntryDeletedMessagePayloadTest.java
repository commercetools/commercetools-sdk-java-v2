
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryDeletedMessagePayloadBuilder builder) {
        InventoryEntryDeletedMessagePayload inventoryEntryDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryDeletedMessagePayload)
                .isInstanceOf(InventoryEntryDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntryDeletedMessagePayload.builder().sku("sku") },
                new Object[] { "supplyChannel", InventoryEntryDeletedMessagePayload.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntryDeletedMessagePayload value = InventoryEntryDeletedMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void supplyChannel() {
        InventoryEntryDeletedMessagePayload value = InventoryEntryDeletedMessagePayload.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
