
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
public class ShoppingListSetTextLineItemDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetTextLineItemDescriptionActionBuilder builder) {
        ShoppingListSetTextLineItemDescriptionAction shoppingListSetTextLineItemDescriptionAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetTextLineItemDescriptionAction)
                .isInstanceOf(ShoppingListSetTextLineItemDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ShoppingListSetTextLineItemDescriptionAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        ShoppingListSetTextLineItemDescriptionAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { ShoppingListSetTextLineItemDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListSetTextLineItemDescriptionAction value = ShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListSetTextLineItemDescriptionAction value = ShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void description() {
        ShoppingListSetTextLineItemDescriptionAction value = ShoppingListSetTextLineItemDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
