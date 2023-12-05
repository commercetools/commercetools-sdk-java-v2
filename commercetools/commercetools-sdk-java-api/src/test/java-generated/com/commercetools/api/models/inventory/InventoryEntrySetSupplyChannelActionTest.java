
package com.commercetools.api.models.inventory;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class InventoryEntrySetSupplyChannelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntrySetSupplyChannelActionBuilder builder) {
        InventoryEntrySetSupplyChannelAction inventoryEntrySetSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetSupplyChannelAction)
                .isInstanceOf(InventoryEntrySetSupplyChannelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntrySetSupplyChannelAction.builder()
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
