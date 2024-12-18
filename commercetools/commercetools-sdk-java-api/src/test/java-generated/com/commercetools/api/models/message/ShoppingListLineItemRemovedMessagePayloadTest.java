
package com.commercetools.api.models.message;

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
public class ShoppingListLineItemRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListLineItemRemovedMessagePayloadBuilder builder) {
        ShoppingListLineItemRemovedMessagePayload shoppingListLineItemRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemRemovedMessagePayload)
                .isInstanceOf(ShoppingListLineItemRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListLineItemRemovedMessagePayload.builder()
                .lineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl()) } };
    }

    @Test
    public void lineItem() {
        ShoppingListLineItemRemovedMessagePayload value = ShoppingListLineItemRemovedMessagePayload.of();
        value.setLineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
    }
}
