
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentBuilder builder) {
        MyPayment myPayment = builder.buildUnchecked();
        Assertions.assertThat(myPayment).isInstanceOf(MyPayment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", MyPayment.builder().id("id") },
                new Object[] { "version", MyPayment.builder().version(2L) },
                new Object[] { "customer",
                        MyPayment.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "anonymousId", MyPayment.builder().anonymousId("anonymousId") },
                new Object[] { "amountPlanned",
                        MyPayment.builder()
                                .amountPlanned(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "paymentMethodInfo",
                        MyPayment.builder()
                                .paymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl()) },
                new Object[] { "transactions",
                        MyPayment.builder()
                                .transactions(Collections
                                        .singletonList(new com.commercetools.api.models.payment.TransactionImpl())) },
                new Object[] { "custom",
                        MyPayment.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        MyPayment value = MyPayment.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        MyPayment value = MyPayment.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void customer() {
        MyPayment value = MyPayment.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void anonymousId() {
        MyPayment value = MyPayment.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void amountPlanned() {
        MyPayment value = MyPayment.of();
        value.setAmountPlanned(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getAmountPlanned())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void paymentMethodInfo() {
        MyPayment value = MyPayment.of();
        value.setPaymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
        Assertions.assertThat(value.getPaymentMethodInfo())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
    }

    @Test
    public void transactions() {
        MyPayment value = MyPayment.of();
        value.setTransactions(Collections.singletonList(new com.commercetools.api.models.payment.TransactionImpl()));
        Assertions.assertThat(value.getTransactions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.TransactionImpl()));
    }

    @Test
    public void custom() {
        MyPayment value = MyPayment.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
