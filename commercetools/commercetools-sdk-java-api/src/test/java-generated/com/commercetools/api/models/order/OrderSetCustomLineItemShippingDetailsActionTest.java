
package com.commercetools.api.models.order;

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
public class OrderSetCustomLineItemShippingDetailsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetCustomLineItemShippingDetailsActionBuilder builder) {
        OrderSetCustomLineItemShippingDetailsAction orderSetCustomLineItemShippingDetailsAction = builder
                .buildUnchecked();
        Assertions.assertThat(orderSetCustomLineItemShippingDetailsAction)
                .isInstanceOf(OrderSetCustomLineItemShippingDetailsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        OrderSetCustomLineItemShippingDetailsAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        OrderSetCustomLineItemShippingDetailsAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderSetCustomLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderSetCustomLineItemShippingDetailsAction value = OrderSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderSetCustomLineItemShippingDetailsAction value = OrderSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void shippingDetails() {
        OrderSetCustomLineItemShippingDetailsAction value = OrderSetCustomLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
