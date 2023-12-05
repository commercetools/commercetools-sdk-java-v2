
package com.commercetools.history.models.change_value;

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
public class InventoryQuantityValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryQuantityValueBuilder builder) {
        InventoryQuantityValue inventoryQuantityValue = builder.buildUnchecked();
        Assertions.assertThat(inventoryQuantityValue).isInstanceOf(InventoryQuantityValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryQuantityValue.builder().quantityOnStock(2) },
                new Object[] { InventoryQuantityValue.builder().availableQuantity(3) } };
    }

    @Test
    public void quantityOnStock() {
        InventoryQuantityValue value = InventoryQuantityValue.of();
        value.setQuantityOnStock(2);
        Assertions.assertThat(value.getQuantityOnStock()).isEqualTo(2);
    }

    @Test
    public void availableQuantity() {
        InventoryQuantityValue value = InventoryQuantityValue.of();
        value.setAvailableQuantity(3);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3);
    }
}
