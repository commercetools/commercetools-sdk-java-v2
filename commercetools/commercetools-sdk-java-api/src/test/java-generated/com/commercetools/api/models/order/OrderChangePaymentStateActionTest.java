
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
public class OrderChangePaymentStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderChangePaymentStateActionBuilder builder) {
        OrderChangePaymentStateAction orderChangePaymentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderChangePaymentStateAction).isInstanceOf(OrderChangePaymentStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderChangePaymentStateAction.builder()
                .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void paymentState() {
        OrderChangePaymentStateAction value = OrderChangePaymentStateAction.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }
}
