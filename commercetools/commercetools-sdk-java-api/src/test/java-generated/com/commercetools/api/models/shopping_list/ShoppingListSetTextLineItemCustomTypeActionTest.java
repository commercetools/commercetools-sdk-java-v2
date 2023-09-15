
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
public class ShoppingListSetTextLineItemCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetTextLineItemCustomTypeActionBuilder builder) {
        ShoppingListSetTextLineItemCustomTypeAction shoppingListSetTextLineItemCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetTextLineItemCustomTypeAction)
                .isInstanceOf(ShoppingListSetTextLineItemCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        ShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { ShoppingListSetTextLineItemCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { ShoppingListSetTextLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void type() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
