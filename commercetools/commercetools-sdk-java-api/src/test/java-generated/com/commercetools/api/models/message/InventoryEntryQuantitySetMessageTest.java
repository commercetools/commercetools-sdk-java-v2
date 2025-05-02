
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryQuantitySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryQuantitySetMessageBuilder builder) {
        InventoryEntryQuantitySetMessage inventoryEntryQuantitySetMessage = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryQuantitySetMessage).isInstanceOf(InventoryEntryQuantitySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldQuantityOnStock",
                        InventoryEntryQuantitySetMessage.builder().oldQuantityOnStock(4L) },
                new Object[] { "newQuantityOnStock",
                        InventoryEntryQuantitySetMessage.builder().newQuantityOnStock(2L) },
                new Object[] { "oldAvailableQuantity",
                        InventoryEntryQuantitySetMessage.builder().oldAvailableQuantity(9L) },
                new Object[] { "newAvailableQuantity",
                        InventoryEntryQuantitySetMessage.builder().newAvailableQuantity(8L) },
                new Object[] { "supplyChannel", InventoryEntryQuantitySetMessage.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void oldQuantityOnStock() {
        InventoryEntryQuantitySetMessage value = InventoryEntryQuantitySetMessage.of();
        value.setOldQuantityOnStock(4L);
        Assertions.assertThat(value.getOldQuantityOnStock()).isEqualTo(4L);
    }

    @Test
    public void newQuantityOnStock() {
        InventoryEntryQuantitySetMessage value = InventoryEntryQuantitySetMessage.of();
        value.setNewQuantityOnStock(2L);
        Assertions.assertThat(value.getNewQuantityOnStock()).isEqualTo(2L);
    }

    @Test
    public void oldAvailableQuantity() {
        InventoryEntryQuantitySetMessage value = InventoryEntryQuantitySetMessage.of();
        value.setOldAvailableQuantity(9L);
        Assertions.assertThat(value.getOldAvailableQuantity()).isEqualTo(9L);
    }

    @Test
    public void newAvailableQuantity() {
        InventoryEntryQuantitySetMessage value = InventoryEntryQuantitySetMessage.of();
        value.setNewAvailableQuantity(8L);
        Assertions.assertThat(value.getNewAvailableQuantity()).isEqualTo(8L);
    }

    @Test
    public void supplyChannel() {
        InventoryEntryQuantitySetMessage value = InventoryEntryQuantitySetMessage.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
