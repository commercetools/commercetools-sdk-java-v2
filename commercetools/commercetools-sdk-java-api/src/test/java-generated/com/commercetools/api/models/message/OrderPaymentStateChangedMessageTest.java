
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
public class OrderPaymentStateChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPaymentStateChangedMessageBuilder builder) {
        OrderPaymentStateChangedMessage orderPaymentStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentStateChangedMessage).isInstanceOf(OrderPaymentStateChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderPaymentStateChangedMessage.builder()
                        .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { OrderPaymentStateChangedMessage.builder()
                        .oldPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void paymentState() {
        OrderPaymentStateChangedMessage value = OrderPaymentStateChangedMessage.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void oldPaymentState() {
        OrderPaymentStateChangedMessage value = OrderPaymentStateChangedMessage.of();
        value.setOldPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getOldPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }
}
