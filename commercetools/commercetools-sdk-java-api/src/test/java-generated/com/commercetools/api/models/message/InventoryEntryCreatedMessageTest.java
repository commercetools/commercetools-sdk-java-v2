
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
public class InventoryEntryCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryCreatedMessageBuilder builder) {
        InventoryEntryCreatedMessage inventoryEntryCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryCreatedMessage).isInstanceOf(InventoryEntryCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntryCreatedMessage.builder()
                .inventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryImpl()) } };
    }

    @Test
    public void inventoryEntry() {
        InventoryEntryCreatedMessage value = InventoryEntryCreatedMessage.of();
        value.setInventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryImpl());
        Assertions.assertThat(value.getInventoryEntry())
                .isEqualTo(new com.commercetools.api.models.inventory.InventoryEntryImpl());
    }
}
