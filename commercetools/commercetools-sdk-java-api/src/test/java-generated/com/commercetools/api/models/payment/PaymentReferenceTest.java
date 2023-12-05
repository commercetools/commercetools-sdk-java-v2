
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
public class PaymentReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentReferenceBuilder builder) {
        PaymentReference paymentReference = builder.buildUnchecked();
        Assertions.assertThat(paymentReference).isInstanceOf(PaymentReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentReference.builder().obj(new com.commercetools.api.models.payment.PaymentImpl()) },
                new Object[] { PaymentReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        PaymentReference value = PaymentReference.of();
        value.setObj(new com.commercetools.api.models.payment.PaymentImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.payment.PaymentImpl());
    }

    @Test
    public void id() {
        PaymentReference value = PaymentReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
