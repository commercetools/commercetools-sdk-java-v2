
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetSupplyChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetSupplyChannelActionBuilder builder) {
        InventoryEntrySetSupplyChannelAction inventoryEntrySetSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetSupplyChannelAction)
                .isInstanceOf(InventoryEntrySetSupplyChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "supplyChannel", InventoryEntrySetSupplyChannelAction.builder()
                .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void supplyChannel() {
        InventoryEntrySetSupplyChannelAction value = InventoryEntrySetSupplyChannelAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
