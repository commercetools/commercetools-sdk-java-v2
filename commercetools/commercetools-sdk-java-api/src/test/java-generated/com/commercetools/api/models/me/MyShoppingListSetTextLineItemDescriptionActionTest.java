
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
public class MyShoppingListSetTextLineItemDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListSetTextLineItemDescriptionActionBuilder builder) {
        MyShoppingListSetTextLineItemDescriptionAction myShoppingListSetTextLineItemDescriptionAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetTextLineItemDescriptionAction)
                .isInstanceOf(MyShoppingListSetTextLineItemDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        MyShoppingListSetTextLineItemDescriptionAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        MyShoppingListSetTextLineItemDescriptionAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { MyShoppingListSetTextLineItemDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListSetTextLineItemDescriptionAction value = MyShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListSetTextLineItemDescriptionAction value = MyShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void description() {
        MyShoppingListSetTextLineItemDescriptionAction value = MyShoppingListSetTextLineItemDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
