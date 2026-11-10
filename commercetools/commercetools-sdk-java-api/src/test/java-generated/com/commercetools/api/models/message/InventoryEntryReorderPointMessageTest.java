
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryReorderPointMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryReorderPointMessageBuilder builder) {
        InventoryEntryReorderPointMessage inventoryEntryReorderPointMessage = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryReorderPointMessage).isInstanceOf(InventoryEntryReorderPointMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntryReorderPointMessage.builder().sku("sku") },
                new Object[] { "quantityOnStock", InventoryEntryReorderPointMessage.builder().quantityOnStock(2) },
                new Object[] { "supplyChannel", InventoryEntryReorderPointMessage.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntryReorderPointMessage value = InventoryEntryReorderPointMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantityOnStock() {
        InventoryEntryReorderPointMessage value = InventoryEntryReorderPointMessage.of();
        value.setQuantityOnStock(2);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2);
    }

    @Test
    public void supplyChannel() {
        InventoryEntryReorderPointMessage value = InventoryEntryReorderPointMessage.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
