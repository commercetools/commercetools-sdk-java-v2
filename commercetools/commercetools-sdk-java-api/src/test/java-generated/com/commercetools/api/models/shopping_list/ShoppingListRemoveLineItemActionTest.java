
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
public class ShoppingListRemoveLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListRemoveLineItemActionBuilder builder) {
        ShoppingListRemoveLineItemAction shoppingListRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListRemoveLineItemAction).isInstanceOf(ShoppingListRemoveLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { ShoppingListRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { ShoppingListRemoveLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        ShoppingListRemoveLineItemAction value = ShoppingListRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListRemoveLineItemAction value = ShoppingListRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListRemoveLineItemAction value = ShoppingListRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
