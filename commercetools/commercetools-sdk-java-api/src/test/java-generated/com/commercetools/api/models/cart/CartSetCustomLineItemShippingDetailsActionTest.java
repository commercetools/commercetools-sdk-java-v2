
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
public class CartSetCustomLineItemShippingDetailsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetCustomLineItemShippingDetailsActionBuilder builder) {
        CartSetCustomLineItemShippingDetailsAction cartSetCustomLineItemShippingDetailsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemShippingDetailsAction)
                .isInstanceOf(CartSetCustomLineItemShippingDetailsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        CartSetCustomLineItemShippingDetailsAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        CartSetCustomLineItemShippingDetailsAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartSetCustomLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemShippingDetailsAction value = CartSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemShippingDetailsAction value = CartSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void shippingDetails() {
        CartSetCustomLineItemShippingDetailsAction value = CartSetCustomLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
