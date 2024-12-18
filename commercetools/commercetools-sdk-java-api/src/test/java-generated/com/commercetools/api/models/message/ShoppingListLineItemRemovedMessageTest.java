
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
public class ShoppingListLineItemRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListLineItemRemovedMessageBuilder builder) {
        ShoppingListLineItemRemovedMessage shoppingListLineItemRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemRemovedMessage)
                .isInstanceOf(ShoppingListLineItemRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListLineItemRemovedMessage.builder()
                .lineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl()) } };
    }

    @Test
    public void lineItem() {
        ShoppingListLineItemRemovedMessage value = ShoppingListLineItemRemovedMessage.of();
        value.setLineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
    }
}
