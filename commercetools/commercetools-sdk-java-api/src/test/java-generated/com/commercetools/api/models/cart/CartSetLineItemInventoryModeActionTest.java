
package com.commercetools.api.models.cart;

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
public class CartSetLineItemInventoryModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetLineItemInventoryModeActionBuilder builder) {
        CartSetLineItemInventoryModeAction cartSetLineItemInventoryModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemInventoryModeAction)
                .isInstanceOf(CartSetLineItemInventoryModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetLineItemInventoryModeAction.builder().lineItemId("lineItemId") },
                new Object[] { CartSetLineItemInventoryModeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartSetLineItemInventoryModeAction.builder()
                        .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemInventoryModeAction value = CartSetLineItemInventoryModeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemInventoryModeAction value = CartSetLineItemInventoryModeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void inventoryMode() {
        CartSetLineItemInventoryModeAction value = CartSetLineItemInventoryModeAction.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }
}
