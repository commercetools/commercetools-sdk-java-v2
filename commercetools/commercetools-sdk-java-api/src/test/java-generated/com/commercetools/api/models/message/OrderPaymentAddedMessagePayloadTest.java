
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
public class OrderPaymentAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPaymentAddedMessagePayloadBuilder builder) {
        OrderPaymentAddedMessagePayload orderPaymentAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentAddedMessagePayload).isInstanceOf(OrderPaymentAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderPaymentAddedMessagePayload.builder()
                .payment(new com.commercetools.api.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void payment() {
        OrderPaymentAddedMessagePayload value = OrderPaymentAddedMessagePayload.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }
}
