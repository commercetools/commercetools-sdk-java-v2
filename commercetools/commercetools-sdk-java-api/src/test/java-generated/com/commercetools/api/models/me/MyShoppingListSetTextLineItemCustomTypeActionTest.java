
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
public class MyShoppingListSetTextLineItemCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListSetTextLineItemCustomTypeActionBuilder builder) {
        MyShoppingListSetTextLineItemCustomTypeAction myShoppingListSetTextLineItemCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetTextLineItemCustomTypeAction)
                .isInstanceOf(MyShoppingListSetTextLineItemCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        MyShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        MyShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { MyShoppingListSetTextLineItemCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { MyShoppingListSetTextLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void type() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
