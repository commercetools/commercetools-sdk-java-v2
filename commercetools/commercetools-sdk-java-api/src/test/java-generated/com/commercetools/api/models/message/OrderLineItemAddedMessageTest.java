
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
public class OrderLineItemAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemAddedMessageBuilder builder) {
        OrderLineItemAddedMessage orderLineItemAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemAddedMessage).isInstanceOf(OrderLineItemAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderLineItemAddedMessage.builder()
                        .lineItem(new com.commercetools.api.models.cart.LineItemImpl()) },
                new Object[] { OrderLineItemAddedMessage.builder().addedQuantity(2L) } };
    }

    @Test
    public void lineItem() {
        OrderLineItemAddedMessage value = OrderLineItemAddedMessage.of();
        value.setLineItem(new com.commercetools.api.models.cart.LineItemImpl());
        Assertions.assertThat(value.getLineItem()).isEqualTo(new com.commercetools.api.models.cart.LineItemImpl());
    }

    @Test
    public void addedQuantity() {
        OrderLineItemAddedMessage value = OrderLineItemAddedMessage.of();
        value.setAddedQuantity(2L);
        Assertions.assertThat(value.getAddedQuantity()).isEqualTo(2L);
    }
}
