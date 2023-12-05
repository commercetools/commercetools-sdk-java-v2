
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
public class MyShoppingListRemoveLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListRemoveLineItemActionBuilder builder) {
        MyShoppingListRemoveLineItemAction myShoppingListRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListRemoveLineItemAction)
                .isInstanceOf(MyShoppingListRemoveLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyShoppingListRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { MyShoppingListRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyShoppingListRemoveLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        MyShoppingListRemoveLineItemAction value = MyShoppingListRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyShoppingListRemoveLineItemAction value = MyShoppingListRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListRemoveLineItemAction value = MyShoppingListRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
