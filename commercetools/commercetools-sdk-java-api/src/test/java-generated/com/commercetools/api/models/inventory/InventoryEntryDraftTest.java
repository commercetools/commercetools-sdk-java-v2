
package com.commercetools.api.models.inventory;

import java.time.ZonedDateTime;

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
public class InventoryEntryDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryDraftBuilder builder) {
        InventoryEntryDraft inventoryEntryDraft = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryDraft).isInstanceOf(InventoryEntryDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntryDraft.builder().sku("sku") },
                new Object[] { InventoryEntryDraft.builder().key("key") },
                new Object[] { InventoryEntryDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { InventoryEntryDraft.builder().quantityOnStock(2L) },
                new Object[] { InventoryEntryDraft.builder().restockableInDays(4L) },
                new Object[] {
                        InventoryEntryDraft.builder().expectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { InventoryEntryDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void sku() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void supplyChannel() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void quantityOnStock() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setQuantityOnStock(2L);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2L);
    }

    @Test
    public void restockableInDays() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void expectedDelivery() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setExpectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpectedDelivery()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
