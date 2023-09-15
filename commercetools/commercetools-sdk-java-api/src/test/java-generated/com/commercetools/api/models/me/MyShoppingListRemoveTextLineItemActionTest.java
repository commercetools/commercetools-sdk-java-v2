
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
public class MyShoppingListRemoveTextLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListRemoveTextLineItemActionBuilder builder) {
        MyShoppingListRemoveTextLineItemAction myShoppingListRemoveTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListRemoveTextLineItemAction)
                .isInstanceOf(MyShoppingListRemoveTextLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyShoppingListRemoveTextLineItemAction.builder().textLineItemId("textLineItemId") },
                new Object[] { MyShoppingListRemoveTextLineItemAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { MyShoppingListRemoveTextLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListRemoveTextLineItemAction value = MyShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListRemoveTextLineItemAction value = MyShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListRemoveTextLineItemAction value = MyShoppingListRemoveTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
