
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
public class InventoryEntrySetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntrySetCustomFieldActionBuilder builder) {
        InventoryEntrySetCustomFieldAction inventoryEntrySetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetCustomFieldAction)
                .isInstanceOf(InventoryEntrySetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntrySetCustomFieldAction.builder().name("name") },
                new Object[] { InventoryEntrySetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        InventoryEntrySetCustomFieldAction value = InventoryEntrySetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        InventoryEntrySetCustomFieldAction value = InventoryEntrySetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
