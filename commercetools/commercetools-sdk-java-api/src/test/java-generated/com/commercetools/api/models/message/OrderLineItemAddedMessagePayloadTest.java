
package com.commercetools.api.models.message;

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
public class OrderLineItemAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemAddedMessagePayloadBuilder builder) {
        OrderLineItemAddedMessagePayload orderLineItemAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemAddedMessagePayload).isInstanceOf(OrderLineItemAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderLineItemAddedMessagePayload.builder()
                        .lineItem(new com.commercetools.api.models.cart.LineItemImpl()) },
                new Object[] { OrderLineItemAddedMessagePayload.builder().addedQuantity(2L) } };
    }

    @Test
    public void lineItem() {
        OrderLineItemAddedMessagePayload value = OrderLineItemAddedMessagePayload.of();
        value.setLineItem(new com.commercetools.api.models.cart.LineItemImpl());
        Assertions.assertThat(value.getLineItem()).isEqualTo(new com.commercetools.api.models.cart.LineItemImpl());
    }

    @Test
    public void addedQuantity() {
        OrderLineItemAddedMessagePayload value = OrderLineItemAddedMessagePayload.of();
        value.setAddedQuantity(2L);
        Assertions.assertThat(value.getAddedQuantity()).isEqualTo(2L);
    }
}
