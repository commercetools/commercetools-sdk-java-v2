
package com.commercetools.api.models.me;

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
public class MyShoppingListChangeTextLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListChangeTextLineItemQuantityActionBuilder builder) {
        MyShoppingListChangeTextLineItemQuantityAction myShoppingListChangeTextLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeTextLineItemQuantityAction)
                .isInstanceOf(MyShoppingListChangeTextLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        MyShoppingListChangeTextLineItemQuantityAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        MyShoppingListChangeTextLineItemQuantityAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { MyShoppingListChangeTextLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListChangeTextLineItemQuantityAction value = MyShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListChangeTextLineItemQuantityAction value = MyShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListChangeTextLineItemQuantityAction value = MyShoppingListChangeTextLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
