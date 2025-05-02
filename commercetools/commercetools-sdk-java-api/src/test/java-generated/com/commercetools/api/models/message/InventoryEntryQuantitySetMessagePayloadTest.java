
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryQuantitySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryQuantitySetMessagePayloadBuilder builder) {
        InventoryEntryQuantitySetMessagePayload inventoryEntryQuantitySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryQuantitySetMessagePayload)
                .isInstanceOf(InventoryEntryQuantitySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldQuantityOnStock",
                        InventoryEntryQuantitySetMessagePayload.builder().oldQuantityOnStock(4L) },
                new Object[] { "newQuantityOnStock",
                        InventoryEntryQuantitySetMessagePayload.builder().newQuantityOnStock(2L) },
                new Object[] { "oldAvailableQuantity",
                        InventoryEntryQuantitySetMessagePayload.builder().oldAvailableQuantity(9L) },
                new Object[] { "newAvailableQuantity",
                        InventoryEntryQuantitySetMessagePayload.builder().newAvailableQuantity(8L) },
                new Object[] { "supplyChannel", InventoryEntryQuantitySetMessagePayload.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void oldQuantityOnStock() {
        InventoryEntryQuantitySetMessagePayload value = InventoryEntryQuantitySetMessagePayload.of();
        value.setOldQuantityOnStock(4L);
        Assertions.assertThat(value.getOldQuantityOnStock()).isEqualTo(4L);
    }

    @Test
    public void newQuantityOnStock() {
        InventoryEntryQuantitySetMessagePayload value = InventoryEntryQuantitySetMessagePayload.of();
        value.setNewQuantityOnStock(2L);
        Assertions.assertThat(value.getNewQuantityOnStock()).isEqualTo(2L);
    }

    @Test
    public void oldAvailableQuantity() {
        InventoryEntryQuantitySetMessagePayload value = InventoryEntryQuantitySetMessagePayload.of();
        value.setOldAvailableQuantity(9L);
        Assertions.assertThat(value.getOldAvailableQuantity()).isEqualTo(9L);
    }

    @Test
    public void newAvailableQuantity() {
        InventoryEntryQuantitySetMessagePayload value = InventoryEntryQuantitySetMessagePayload.of();
        value.setNewAvailableQuantity(8L);
        Assertions.assertThat(value.getNewAvailableQuantity()).isEqualTo(8L);
    }

    @Test
    public void supplyChannel() {
        InventoryEntryQuantitySetMessagePayload value = InventoryEntryQuantitySetMessagePayload.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
