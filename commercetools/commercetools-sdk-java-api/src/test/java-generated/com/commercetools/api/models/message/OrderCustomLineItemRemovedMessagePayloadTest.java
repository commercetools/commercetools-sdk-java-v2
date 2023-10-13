
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
public class OrderCustomLineItemRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemRemovedMessagePayloadBuilder builder) {
        OrderCustomLineItemRemovedMessagePayload orderCustomLineItemRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemRemovedMessagePayload)
                .isInstanceOf(OrderCustomLineItemRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        OrderCustomLineItemRemovedMessagePayload.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        OrderCustomLineItemRemovedMessagePayload.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderCustomLineItemRemovedMessagePayload.builder()
                        .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemRemovedMessagePayload value = OrderCustomLineItemRemovedMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemRemovedMessagePayload value = OrderCustomLineItemRemovedMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemRemovedMessagePayload value = OrderCustomLineItemRemovedMessagePayload.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}
