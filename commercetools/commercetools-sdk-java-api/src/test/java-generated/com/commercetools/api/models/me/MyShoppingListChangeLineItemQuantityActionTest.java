
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
public class MyShoppingListChangeLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListChangeLineItemQuantityActionBuilder builder) {
        MyShoppingListChangeLineItemQuantityAction myShoppingListChangeLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeLineItemQuantityAction)
                .isInstanceOf(MyShoppingListChangeLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyShoppingListChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { MyShoppingListChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyShoppingListChangeLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        MyShoppingListChangeLineItemQuantityAction value = MyShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyShoppingListChangeLineItemQuantityAction value = MyShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListChangeLineItemQuantityAction value = MyShoppingListChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
