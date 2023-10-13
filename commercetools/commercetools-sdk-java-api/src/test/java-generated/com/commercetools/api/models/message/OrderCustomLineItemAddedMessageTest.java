
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
public class OrderCustomLineItemAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemAddedMessageBuilder builder) {
        OrderCustomLineItemAddedMessage orderCustomLineItemAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemAddedMessage).isInstanceOf(OrderCustomLineItemAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomLineItemAddedMessage.builder()
                .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemAddedMessage value = OrderCustomLineItemAddedMessage.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}
