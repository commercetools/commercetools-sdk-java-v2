
package com.commercetools.api.models.shopping_list;

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
public class ShoppingListChangeLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListChangeLineItemQuantityActionBuilder builder) {
        ShoppingListChangeLineItemQuantityAction shoppingListChangeLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListChangeLineItemQuantityAction)
                .isInstanceOf(ShoppingListChangeLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { ShoppingListChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { ShoppingListChangeLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        ShoppingListChangeLineItemQuantityAction value = ShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListChangeLineItemQuantityAction value = ShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListChangeLineItemQuantityAction value = ShoppingListChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
