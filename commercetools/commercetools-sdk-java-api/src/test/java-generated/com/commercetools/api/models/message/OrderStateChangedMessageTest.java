
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
public class OrderStateChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderStateChangedMessageBuilder builder) {
        OrderStateChangedMessage orderStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderStateChangedMessage).isInstanceOf(OrderStateChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderStateChangedMessage.builder()
                        .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { OrderStateChangedMessage.builder()
                        .oldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        OrderStateChangedMessage value = OrderStateChangedMessage.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void oldOrderState() {
        OrderStateChangedMessage value = OrderStateChangedMessage.of();
        value.setOldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOldOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
