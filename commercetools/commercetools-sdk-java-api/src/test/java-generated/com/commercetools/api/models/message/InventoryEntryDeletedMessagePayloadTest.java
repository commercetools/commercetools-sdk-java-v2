
package com.commercetools.api.models.message;

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
public class InventoryEntryDeletedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryDeletedMessagePayloadBuilder builder) {
        InventoryEntryDeletedMessagePayload inventoryEntryDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryDeletedMessagePayload)
                .isInstanceOf(InventoryEntryDeletedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntryDeletedMessagePayload.builder().sku("sku") },
                new Object[] { InventoryEntryDeletedMessagePayload.builder()
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
