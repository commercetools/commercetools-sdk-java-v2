
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
public class OrderCustomLineItemRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemRemovedMessageBuilder builder) {
        OrderCustomLineItemRemovedMessage orderCustomLineItemRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemRemovedMessage).isInstanceOf(OrderCustomLineItemRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomLineItemRemovedMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { OrderCustomLineItemRemovedMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderCustomLineItemRemovedMessage.builder()
                        .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemRemovedMessage value = OrderCustomLineItemRemovedMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemRemovedMessage value = OrderCustomLineItemRemovedMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemRemovedMessage value = OrderCustomLineItemRemovedMessage.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}
