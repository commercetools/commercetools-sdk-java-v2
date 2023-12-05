
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
public class ShoppingListRemoveTextLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListRemoveTextLineItemActionBuilder builder) {
        ShoppingListRemoveTextLineItemAction shoppingListRemoveTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListRemoveTextLineItemAction)
                .isInstanceOf(ShoppingListRemoveTextLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListRemoveTextLineItemAction.builder().textLineItemId("textLineItemId") },
                new Object[] { ShoppingListRemoveTextLineItemAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { ShoppingListRemoveTextLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListRemoveTextLineItemAction value = ShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListRemoveTextLineItemAction value = ShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListRemoveTextLineItemAction value = ShoppingListRemoveTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
