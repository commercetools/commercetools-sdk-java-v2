
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
public class InventoryEntryReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryReferenceBuilder builder) {
        InventoryEntryReference inventoryEntryReference = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryReference).isInstanceOf(InventoryEntryReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { InventoryEntryReference.builder()
                        .obj(new com.commercetools.api.models.inventory.InventoryEntryImpl()) },
                new Object[] { InventoryEntryReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        InventoryEntryReference value = InventoryEntryReference.of();
        value.setObj(new com.commercetools.api.models.inventory.InventoryEntryImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.inventory.InventoryEntryImpl());
    }

    @Test
    public void id() {
        InventoryEntryReference value = InventoryEntryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
