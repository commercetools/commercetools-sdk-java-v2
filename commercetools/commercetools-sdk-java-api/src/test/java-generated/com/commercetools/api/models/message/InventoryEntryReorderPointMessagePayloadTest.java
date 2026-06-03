
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryReorderPointMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryReorderPointMessagePayloadBuilder builder) {
        InventoryEntryReorderPointMessagePayload inventoryEntryReorderPointMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryReorderPointMessagePayload)
                .isInstanceOf(InventoryEntryReorderPointMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntryReorderPointMessagePayload.builder().sku("sku") },
                new Object[] { "quantityOnStock",
                        InventoryEntryReorderPointMessagePayload.builder().quantityOnStock(2) },
                new Object[] { "supplyChannel", InventoryEntryReorderPointMessagePayload.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntryReorderPointMessagePayload value = InventoryEntryReorderPointMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantityOnStock() {
        InventoryEntryReorderPointMessagePayload value = InventoryEntryReorderPointMessagePayload.of();
        value.setQuantityOnStock(2);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2);
    }

    @Test
    public void supplyChannel() {
        InventoryEntryReorderPointMessagePayload value = InventoryEntryReorderPointMessagePayload.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
