
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

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
public class ShoppingListChangeTextLineItemsOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListChangeTextLineItemsOrderActionBuilder builder) {
        ShoppingListChangeTextLineItemsOrderAction shoppingListChangeTextLineItemsOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListChangeTextLineItemsOrderAction)
                .isInstanceOf(ShoppingListChangeTextLineItemsOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListChangeTextLineItemsOrderAction.builder()
                .textLineItemOrder(Collections.singletonList("textLineItemOrder")) } };
    }

    @Test
    public void textLineItemOrder() {
        ShoppingListChangeTextLineItemsOrderAction value = ShoppingListChangeTextLineItemsOrderAction.of();
        value.setTextLineItemOrder(Collections.singletonList("textLineItemOrder"));
        Assertions.assertThat(value.getTextLineItemOrder()).isEqualTo(Collections.singletonList("textLineItemOrder"));
    }
}
