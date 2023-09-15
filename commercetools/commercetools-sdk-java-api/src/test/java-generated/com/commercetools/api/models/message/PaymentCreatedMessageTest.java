
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
public class PaymentCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentCreatedMessageBuilder builder) {
        PaymentCreatedMessage paymentCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentCreatedMessage).isInstanceOf(PaymentCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                PaymentCreatedMessage.builder().payment(new com.commercetools.api.models.payment.PaymentImpl()) } };
    }

    @Test
    public void payment() {
        PaymentCreatedMessage value = PaymentCreatedMessage.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentImpl());
        Assertions.assertThat(value.getPayment()).isEqualTo(new com.commercetools.api.models.payment.PaymentImpl());
    }
}
