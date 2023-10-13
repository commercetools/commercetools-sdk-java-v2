
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
public class ShoppingListChangeLineItemsOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListChangeLineItemsOrderActionBuilder builder) {
        ShoppingListChangeLineItemsOrderAction shoppingListChangeLineItemsOrderAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListChangeLineItemsOrderAction)
                .isInstanceOf(ShoppingListChangeLineItemsOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListChangeLineItemsOrderAction.builder()
                .lineItemOrder(Collections.singletonList("lineItemOrder")) } };
    }

    @Test
    public void lineItemOrder() {
        ShoppingListChangeLineItemsOrderAction value = ShoppingListChangeLineItemsOrderAction.of();
        value.setLineItemOrder(Collections.singletonList("lineItemOrder"));
        Assertions.assertThat(value.getLineItemOrder()).isEqualTo(Collections.singletonList("lineItemOrder"));
    }
}
