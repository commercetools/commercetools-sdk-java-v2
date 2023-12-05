
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
public class InventoryEntrySetRestockableInDaysActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntrySetRestockableInDaysActionBuilder builder) {
        InventoryEntrySetRestockableInDaysAction inventoryEntrySetRestockableInDaysAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetRestockableInDaysAction)
                .isInstanceOf(InventoryEntrySetRestockableInDaysAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { InventoryEntrySetRestockableInDaysAction.builder().restockableInDays(4L) } };
    }

    @Test
    public void restockableInDays() {
        InventoryEntrySetRestockableInDaysAction value = InventoryEntrySetRestockableInDaysAction.of();
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }
}
