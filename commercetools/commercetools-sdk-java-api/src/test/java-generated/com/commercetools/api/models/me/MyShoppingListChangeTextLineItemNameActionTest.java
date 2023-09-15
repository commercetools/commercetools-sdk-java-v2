
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
public class MyShoppingListChangeTextLineItemNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListChangeTextLineItemNameActionBuilder builder) {
        MyShoppingListChangeTextLineItemNameAction myShoppingListChangeTextLineItemNameAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeTextLineItemNameAction)
                .isInstanceOf(MyShoppingListChangeTextLineItemNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyShoppingListChangeTextLineItemNameAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        MyShoppingListChangeTextLineItemNameAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { MyShoppingListChangeTextLineItemNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListChangeTextLineItemNameAction value = MyShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListChangeTextLineItemNameAction value = MyShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        MyShoppingListChangeTextLineItemNameAction value = MyShoppingListChangeTextLineItemNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
