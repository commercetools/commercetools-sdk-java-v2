
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
public class InventoryEntryChangeQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntryChangeQuantityActionBuilder builder) {
        InventoryEntryChangeQuantityAction inventoryEntryChangeQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryChangeQuantityAction)
                .isInstanceOf(InventoryEntryChangeQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntryChangeQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void quantity() {
        InventoryEntryChangeQuantityAction value = InventoryEntryChangeQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
