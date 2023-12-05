
package com.commercetools.api.models.payment;

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
public class PaymentMethodInfoTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentMethodInfoBuilder builder) {
        PaymentMethodInfo paymentMethodInfo = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfo).isInstanceOf(PaymentMethodInfo.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentMethodInfo.builder().paymentInterface("paymentInterface") },
                new Object[] { PaymentMethodInfo.builder().method("method") },
                new Object[] { PaymentMethodInfo.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void paymentInterface() {
        PaymentMethodInfo value = PaymentMethodInfo.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void method() {
        PaymentMethodInfo value = PaymentMethodInfo.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void name() {
        PaymentMethodInfo value = PaymentMethodInfo.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
