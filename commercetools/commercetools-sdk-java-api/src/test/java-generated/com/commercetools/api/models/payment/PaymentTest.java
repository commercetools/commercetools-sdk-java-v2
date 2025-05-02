
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentBuilder builder) {
        Payment payment = builder.buildUnchecked();
        Assertions.assertThat(payment).isInstanceOf(Payment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Payment.builder().id("id") },
                new Object[] { "version", Payment.builder().version(2L) },
                new Object[] { "createdAt", Payment.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Payment.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Payment.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Payment.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "customer",
                        Payment.builder().customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "anonymousId", Payment.builder().anonymousId("anonymousId") },
                new Object[] { "interfaceId", Payment.builder().interfaceId("interfaceId") },
                new Object[] { "amountPlanned",
                        Payment.builder()
                                .amountPlanned(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "paymentMethodInfo",
                        Payment.builder()
                                .paymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl()) },
                new Object[] { "paymentStatus",
                        Payment.builder().paymentStatus(new com.commercetools.api.models.payment.PaymentStatusImpl()) },
                new Object[] { "transactions",
                        Payment.builder()
                                .transactions(Collections
                                        .singletonList(new com.commercetools.api.models.payment.TransactionImpl())) },
                new Object[] { "interfaceInteractions",
                        Payment.builder()
                                .interfaceInteractions(Collections
                                        .singletonList(new com.commercetools.api.models.type.CustomFieldsImpl())) },
                new Object[] { "custom",
                        Payment.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "key", Payment.builder().key("key") } };
    }

    @Test
    public void id() {
        Payment value = Payment.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Payment value = Payment.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Payment value = Payment.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Payment value = Payment.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Payment value = Payment.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Payment value = Payment.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void customer() {
        Payment value = Payment.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void anonymousId() {
        Payment value = Payment.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void interfaceId() {
        Payment value = Payment.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }

    @Test
    public void amountPlanned() {
        Payment value = Payment.of();
        value.setAmountPlanned(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getAmountPlanned())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void paymentMethodInfo() {
        Payment value = Payment.of();
        value.setPaymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
        Assertions.assertThat(value.getPaymentMethodInfo())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
    }

    @Test
    public void paymentStatus() {
        Payment value = Payment.of();
        value.setPaymentStatus(new com.commercetools.api.models.payment.PaymentStatusImpl());
        Assertions.assertThat(value.getPaymentStatus())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentStatusImpl());
    }

    @Test
    public void transactions() {
        Payment value = Payment.of();
        value.setTransactions(Collections.singletonList(new com.commercetools.api.models.payment.TransactionImpl()));
        Assertions.assertThat(value.getTransactions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.TransactionImpl()));
    }

    @Test
    public void interfaceInteractions() {
        Payment value = Payment.of();
        value.setInterfaceInteractions(
            Collections.singletonList(new com.commercetools.api.models.type.CustomFieldsImpl()));
        Assertions.assertThat(value.getInterfaceInteractions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.CustomFieldsImpl()));
    }

    @Test
    public void custom() {
        Payment value = Payment.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void key() {
        Payment value = Payment.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
