
package com.commercetools.api.models.cart;

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
public class CartSetCustomLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetCustomLineItemCustomFieldActionBuilder builder) {
        CartSetCustomLineItemCustomFieldAction cartSetCustomLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemCustomFieldAction)
                .isInstanceOf(CartSetCustomLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetCustomLineItemCustomFieldAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        CartSetCustomLineItemCustomFieldAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartSetCustomLineItemCustomFieldAction.builder().name("name") },
                new Object[] { CartSetCustomLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void name() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
