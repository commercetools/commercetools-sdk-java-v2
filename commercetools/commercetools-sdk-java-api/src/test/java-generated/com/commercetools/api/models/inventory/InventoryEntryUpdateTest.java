
package com.commercetools.api.models.inventory;

import java.util.Collections;

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
public class InventoryEntryUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryUpdateBuilder builder) {
        InventoryEntryUpdate inventoryEntryUpdate = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryUpdate).isInstanceOf(InventoryEntryUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntryUpdate.builder().version(2L) },
                new Object[] { InventoryEntryUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.inventory.InventoryEntryUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        InventoryEntryUpdate value = InventoryEntryUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        InventoryEntryUpdate value = InventoryEntryUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.inventory.InventoryEntryUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.inventory.InventoryEntryUpdateActionImpl()));
    }
}
