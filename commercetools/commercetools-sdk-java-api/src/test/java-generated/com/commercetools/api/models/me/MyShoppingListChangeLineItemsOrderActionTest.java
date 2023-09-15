
package com.commercetools.api.models.me;

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
public class MyShoppingListChangeLineItemsOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListChangeLineItemsOrderActionBuilder builder) {
        MyShoppingListChangeLineItemsOrderAction myShoppingListChangeLineItemsOrderAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListChangeLineItemsOrderAction)
                .isInstanceOf(MyShoppingListChangeLineItemsOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyShoppingListChangeLineItemsOrderAction.builder()
                .lineItemOrder(Collections.singletonList("lineItemOrder")) } };
    }

    @Test
    public void lineItemOrder() {
        MyShoppingListChangeLineItemsOrderAction value = MyShoppingListChangeLineItemsOrderAction.of();
        value.setLineItemOrder(Collections.singletonList("lineItemOrder"));
        Assertions.assertThat(value.getLineItemOrder()).isEqualTo(Collections.singletonList("lineItemOrder"));
    }
}
