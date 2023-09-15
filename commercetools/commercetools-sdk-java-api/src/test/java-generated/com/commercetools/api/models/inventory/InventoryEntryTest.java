
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
public class InventoryEntryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryBuilder builder) {
        InventoryEntry inventoryEntry = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntry).isInstanceOf(InventoryEntry.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntry.builder().id("id") },
                new Object[] { InventoryEntry.builder().version(2L) },
                new Object[] { InventoryEntry.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { InventoryEntry.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { InventoryEntry.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        InventoryEntry.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { InventoryEntry.builder().key("key") },
                new Object[] { InventoryEntry.builder().sku("sku") },
                new Object[] { InventoryEntry.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { InventoryEntry.builder().quantityOnStock(2L) },
                new Object[] { InventoryEntry.builder().availableQuantity(3L) },
                new Object[] { InventoryEntry.builder().restockableInDays(4L) },
                new Object[] { InventoryEntry.builder().expectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        InventoryEntry.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        InventoryEntry value = InventoryEntry.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        InventoryEntry value = InventoryEntry.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        InventoryEntry value = InventoryEntry.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        InventoryEntry value = InventoryEntry.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        InventoryEntry value = InventoryEntry.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        InventoryEntry value = InventoryEntry.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        InventoryEntry value = InventoryEntry.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        InventoryEntry value = InventoryEntry.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void supplyChannel() {
        InventoryEntry value = InventoryEntry.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void quantityOnStock() {
        InventoryEntry value = InventoryEntry.of();
        value.setQuantityOnStock(2L);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2L);
    }

    @Test
    public void availableQuantity() {
        InventoryEntry value = InventoryEntry.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }

    @Test
    public void restockableInDays() {
        InventoryEntry value = InventoryEntry.of();
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void expectedDelivery() {
        InventoryEntry value = InventoryEntry.of();
        value.setExpectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpectedDelivery()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        InventoryEntry value = InventoryEntry.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
