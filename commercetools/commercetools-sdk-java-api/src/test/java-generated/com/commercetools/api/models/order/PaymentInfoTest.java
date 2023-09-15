
package com.commercetools.api.models.order;

import java.util.Collections;

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
public class PaymentInfoTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentInfoBuilder builder) {
        PaymentInfo paymentInfo = builder.buildUnchecked();
        Assertions.assertThat(paymentInfo).isInstanceOf(PaymentInfo.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentInfo.builder()
                .payments(
                    Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl())) } };
    }

    @Test
    public void payments() {
        PaymentInfo value = PaymentInfo.of();
        value.setPayments(Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl()));
        Assertions.assertThat(value.getPayments())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl()));
    }
}
