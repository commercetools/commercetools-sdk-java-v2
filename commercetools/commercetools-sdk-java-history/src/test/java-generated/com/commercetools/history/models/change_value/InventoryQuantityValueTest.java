
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryQuantityValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryQuantityValueBuilder builder) {
        InventoryQuantityValue inventoryQuantityValue = builder.buildUnchecked();
        Assertions.assertThat(inventoryQuantityValue).isInstanceOf(InventoryQuantityValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quantityOnStock", InventoryQuantityValue.builder().quantityOnStock(2) },
                new Object[] { "availableQuantity", InventoryQuantityValue.builder().availableQuantity(3) } };
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
