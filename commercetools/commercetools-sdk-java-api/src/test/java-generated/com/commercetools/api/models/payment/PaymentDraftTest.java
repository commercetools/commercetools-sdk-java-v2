
package com.commercetools.api.models.payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentDraftBuilder builder) {
        PaymentDraft paymentDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentDraft).isInstanceOf(PaymentDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        PaymentDraft.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "anonymousId", PaymentDraft.builder().anonymousId("anonymousId") },
                new Object[] { "interfaceId", PaymentDraft.builder().interfaceId("interfaceId") },
                new Object[] { "amountPlanned",
                        PaymentDraft.builder().amountPlanned(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "paymentMethodInfo",
                        PaymentDraft.builder()
                                .paymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl()) },
                new Object[] { "paymentStatus",
                        PaymentDraft.builder()
                                .paymentStatus(new com.commercetools.api.models.payment.PaymentStatusDraftImpl()) },
                new Object[] { "transactions",
                        PaymentDraft.builder()
                                .transactions(Collections.singletonList(
                                    new com.commercetools.api.models.payment.TransactionDraftImpl())) },
                new Object[] { "interfaceInteractions",
                        PaymentDraft.builder()
                                .interfaceInteractions(Collections.singletonList(
                                    new com.commercetools.api.models.type.CustomFieldsDraftImpl())) },
                new Object[] { "custom",
                        PaymentDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "key", PaymentDraft.builder().key("key") } };
    }

    @Test
    public void customer() {
        PaymentDraft value = PaymentDraft.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void anonymousId() {
        PaymentDraft value = PaymentDraft.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void interfaceId() {
        PaymentDraft value = PaymentDraft.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }

    @Test
    public void amountPlanned() {
        PaymentDraft value = PaymentDraft.of();
        value.setAmountPlanned(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmountPlanned()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void paymentMethodInfo() {
        PaymentDraft value = PaymentDraft.of();
        value.setPaymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
        Assertions.assertThat(value.getPaymentMethodInfo())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
    }

    @Test
    public void paymentStatus() {
        PaymentDraft value = PaymentDraft.of();
        value.setPaymentStatus(new com.commercetools.api.models.payment.PaymentStatusDraftImpl());
        Assertions.assertThat(value.getPaymentStatus())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentStatusDraftImpl());
    }

    @Test
    public void transactions() {
        PaymentDraft value = PaymentDraft.of();
        value.setTransactions(
            Collections.singletonList(new com.commercetools.api.models.payment.TransactionDraftImpl()));
        Assertions.assertThat(value.getTransactions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.TransactionDraftImpl()));
    }

    @Test
    public void interfaceInteractions() {
        PaymentDraft value = PaymentDraft.of();
        value.setInterfaceInteractions(
            Collections.singletonList(new com.commercetools.api.models.type.CustomFieldsDraftImpl()));
        Assertions.assertThat(value.getInterfaceInteractions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.CustomFieldsDraftImpl()));
    }

    @Test
    public void custom() {
        PaymentDraft value = PaymentDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void key() {
        PaymentDraft value = PaymentDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
