
package com.commercetools.importapi.models.inventories;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryImportBuilder builder) {
        InventoryImport inventoryImport = builder.buildUnchecked();
        Assertions.assertThat(inventoryImport).isInstanceOf(InventoryImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", InventoryImport.builder().key("key") },
                new Object[] { "sku", InventoryImport.builder().sku("sku") },
                new Object[] { "quantityOnStock", InventoryImport.builder().quantityOnStock(2L) },
                new Object[] { "restockableInDays", InventoryImport.builder().restockableInDays(4L) },
                new Object[] { "expectedDelivery",
                        InventoryImport.builder().expectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "supplyChannel", InventoryImport.builder()
                        .supplyChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { "custom", InventoryImport.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void key() {
        InventoryImport value = InventoryImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        InventoryImport value = InventoryImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantityOnStock() {
        InventoryImport value = InventoryImport.of();
        value.setQuantityOnStock(2L);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2L);
    }

    @Test
    public void restockableInDays() {
        InventoryImport value = InventoryImport.of();
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void expectedDelivery() {
        InventoryImport value = InventoryImport.of();
        value.setExpectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpectedDelivery()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void supplyChannel() {
        InventoryImport value = InventoryImport.of();
        value.setSupplyChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void custom() {
        InventoryImport value = InventoryImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
