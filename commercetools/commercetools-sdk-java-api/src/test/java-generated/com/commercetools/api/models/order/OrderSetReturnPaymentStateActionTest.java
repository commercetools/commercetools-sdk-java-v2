
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
public class OrderSetReturnPaymentStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetReturnPaymentStateActionBuilder builder) {
        OrderSetReturnPaymentStateAction orderSetReturnPaymentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnPaymentStateAction).isInstanceOf(OrderSetReturnPaymentStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetReturnPaymentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { OrderSetReturnPaymentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { OrderSetReturnPaymentStateAction.builder()
                        .paymentState(
                            com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable")) } };
    }

    @Test
    public void returnItemId() {
        OrderSetReturnPaymentStateAction value = OrderSetReturnPaymentStateAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        OrderSetReturnPaymentStateAction value = OrderSetReturnPaymentStateAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void paymentState() {
        OrderSetReturnPaymentStateAction value = OrderSetReturnPaymentStateAction.of();
        value.setPaymentState(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
    }
}
