
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
public class ShoppingListChangeTextLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListChangeTextLineItemQuantityActionBuilder builder) {
        ShoppingListChangeTextLineItemQuantityAction shoppingListChangeTextLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListChangeTextLineItemQuantityAction)
                .isInstanceOf(ShoppingListChangeTextLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ShoppingListChangeTextLineItemQuantityAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        ShoppingListChangeTextLineItemQuantityAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { ShoppingListChangeTextLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListChangeTextLineItemQuantityAction value = ShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListChangeTextLineItemQuantityAction value = ShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListChangeTextLineItemQuantityAction value = ShoppingListChangeTextLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
