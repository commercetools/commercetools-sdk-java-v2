
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
public class PaymentCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentCreatedMessagePayloadBuilder builder) {
        PaymentCreatedMessagePayload paymentCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentCreatedMessagePayload).isInstanceOf(PaymentCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentCreatedMessagePayload.builder()
                .payment(new com.commercetools.api.models.payment.PaymentImpl()) } };
    }

    @Test
    public void payment() {
        PaymentCreatedMessagePayload value = PaymentCreatedMessagePayload.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentImpl());
        Assertions.assertThat(value.getPayment()).isEqualTo(new com.commercetools.api.models.payment.PaymentImpl());
    }
}
