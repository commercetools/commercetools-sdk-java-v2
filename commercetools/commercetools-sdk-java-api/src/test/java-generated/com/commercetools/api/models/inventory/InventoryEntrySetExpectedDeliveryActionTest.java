
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
public class InventoryEntrySetExpectedDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryEntrySetExpectedDeliveryActionBuilder builder) {
        InventoryEntrySetExpectedDeliveryAction inventoryEntrySetExpectedDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetExpectedDeliveryAction)
                .isInstanceOf(InventoryEntrySetExpectedDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryEntrySetExpectedDeliveryAction.builder()
                .expectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void expectedDelivery() {
        InventoryEntrySetExpectedDeliveryAction value = InventoryEntrySetExpectedDeliveryAction.of();
        value.setExpectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpectedDelivery()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
