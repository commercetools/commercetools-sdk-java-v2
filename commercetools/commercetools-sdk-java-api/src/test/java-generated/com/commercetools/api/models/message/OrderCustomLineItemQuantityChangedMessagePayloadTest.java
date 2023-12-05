
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
public class OrderCustomLineItemQuantityChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder) {
        OrderCustomLineItemQuantityChangedMessagePayload orderCustomLineItemQuantityChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderCustomLineItemQuantityChangedMessagePayload)
                .isInstanceOf(OrderCustomLineItemQuantityChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomLineItemQuantityChangedMessagePayload.builder()
                        .customLineItemId("customLineItemId") },
                new Object[] { OrderCustomLineItemQuantityChangedMessagePayload.builder()
                        .customLineItemKey("customLineItemKey") },
                new Object[] { OrderCustomLineItemQuantityChangedMessagePayload.builder().quantity(8L) },
                new Object[] { OrderCustomLineItemQuantityChangedMessagePayload.builder().oldQuantity(2L) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void oldQuantity() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setOldQuantity(2L);
        Assertions.assertThat(value.getOldQuantity()).isEqualTo(2L);
    }
}
