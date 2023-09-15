
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
public class ShoppingListChangeTextLineItemNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListChangeTextLineItemNameActionBuilder builder) {
        ShoppingListChangeTextLineItemNameAction shoppingListChangeTextLineItemNameAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListChangeTextLineItemNameAction)
                .isInstanceOf(ShoppingListChangeTextLineItemNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListChangeTextLineItemNameAction.builder().textLineItemId("textLineItemId") },
                new Object[] { ShoppingListChangeTextLineItemNameAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { ShoppingListChangeTextLineItemNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListChangeTextLineItemNameAction value = ShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListChangeTextLineItemNameAction value = ShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        ShoppingListChangeTextLineItemNameAction value = ShoppingListChangeTextLineItemNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
