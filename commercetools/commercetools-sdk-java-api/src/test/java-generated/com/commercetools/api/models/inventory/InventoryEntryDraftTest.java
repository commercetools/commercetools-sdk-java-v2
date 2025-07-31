
package com.commercetools.api.models.inventory;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryDraftBuilder builder) {
        InventoryEntryDraft inventoryEntryDraft = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryDraft).isInstanceOf(InventoryEntryDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", InventoryEntryDraft.builder().sku("sku") },
                new Object[] { "key", InventoryEntryDraft.builder().key("key") },
                new Object[] { "supplyChannel", InventoryEntryDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "quantityOnStock", InventoryEntryDraft.builder().quantityOnStock(2L) },
                new Object[] { "minCartQuantity", InventoryEntryDraft.builder().minCartQuantity(6) },
                new Object[] { "maxCartQuantity", InventoryEntryDraft.builder().maxCartQuantity(4) },
                new Object[] { "restockableInDays", InventoryEntryDraft.builder().restockableInDays(4L) },
                new Object[] { "expectedDelivery",
                        InventoryEntryDraft.builder().expectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom", InventoryEntryDraft.builder()
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
    public void minCartQuantity() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setMinCartQuantity(6);
        Assertions.assertThat(value.getMinCartQuantity()).isEqualTo(6);
    }

    @Test
    public void maxCartQuantity() {
        InventoryEntryDraft value = InventoryEntryDraft.of();
        value.setMaxCartQuantity(4);
        Assertions.assertThat(value.getMaxCartQuantity()).isEqualTo(4);
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
