
package com.commercetools.api.models.payment;

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
public class PaymentUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentUpdateBuilder builder) {
        PaymentUpdate paymentUpdate = builder.buildUnchecked();
        Assertions.assertThat(paymentUpdate).isInstanceOf(PaymentUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentUpdate.builder().version(2L) },
                new Object[] { PaymentUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.payment.PaymentUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        PaymentUpdate value = PaymentUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        PaymentUpdate value = PaymentUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.payment.PaymentUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.payment.PaymentUpdateActionImpl()));
    }
}
