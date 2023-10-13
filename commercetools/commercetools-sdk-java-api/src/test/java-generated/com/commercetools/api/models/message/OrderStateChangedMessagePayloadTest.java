
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
public class OrderStateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderStateChangedMessagePayloadBuilder builder) {
        OrderStateChangedMessagePayload orderStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderStateChangedMessagePayload).isInstanceOf(OrderStateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderStateChangedMessagePayload.builder()
                        .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { OrderStateChangedMessagePayload.builder()
                        .oldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        OrderStateChangedMessagePayload value = OrderStateChangedMessagePayload.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void oldOrderState() {
        OrderStateChangedMessagePayload value = OrderStateChangedMessagePayload.of();
        value.setOldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOldOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
