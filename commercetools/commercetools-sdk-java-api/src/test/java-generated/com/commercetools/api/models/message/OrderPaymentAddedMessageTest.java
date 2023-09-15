
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
public class OrderPaymentAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPaymentAddedMessageBuilder builder) {
        OrderPaymentAddedMessage orderPaymentAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentAddedMessage).isInstanceOf(OrderPaymentAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderPaymentAddedMessage.builder()
                .payment(new com.commercetools.api.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void payment() {
        OrderPaymentAddedMessage value = OrderPaymentAddedMessage.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }
}
