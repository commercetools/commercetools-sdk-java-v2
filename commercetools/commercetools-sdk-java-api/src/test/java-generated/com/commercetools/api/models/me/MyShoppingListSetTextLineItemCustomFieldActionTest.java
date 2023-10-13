
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
public class MyShoppingListSetTextLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListSetTextLineItemCustomFieldActionBuilder builder) {
        MyShoppingListSetTextLineItemCustomFieldAction myShoppingListSetTextLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetTextLineItemCustomFieldAction)
                .isInstanceOf(MyShoppingListSetTextLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        MyShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        MyShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { MyShoppingListSetTextLineItemCustomFieldAction.builder().name("name") },
                new Object[] { MyShoppingListSetTextLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
