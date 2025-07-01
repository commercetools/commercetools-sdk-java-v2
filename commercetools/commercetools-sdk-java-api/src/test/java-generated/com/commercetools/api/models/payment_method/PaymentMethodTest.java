
package com.commercetools.api.models.payment_method;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodBuilder builder) {
        PaymentMethod paymentMethod = builder.buildUnchecked();
        Assertions.assertThat(paymentMethod).isInstanceOf(PaymentMethod.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", PaymentMethod.builder().id("id") },
                new Object[] { "version", PaymentMethod.builder().version(2L) },
                new Object[] { "key", PaymentMethod.builder().key("key") },
                new Object[] { "name",
                        PaymentMethod.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "customer",
                        PaymentMethod.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "businessUnit", PaymentMethod.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "method", PaymentMethod.builder().method("method") },
                new Object[] { "paymentInterface", PaymentMethod.builder().paymentInterface("paymentInterface") },
                new Object[] { "interfaceAccount", PaymentMethod.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "token",
                        PaymentMethod.builder()
                                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) },
                new Object[] { "paymentMethodStatus",
                        PaymentMethod.builder()
                                .paymentMethodStatus(com.commercetools.api.models.payment_method.PaymentMethodStatus
                                        .findEnum("Active")) },
                new Object[] { "default", PaymentMethod.builder()._default(true) },
                new Object[] { "custom",
                        PaymentMethod.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "createdAt",
                        PaymentMethod.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        PaymentMethod.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        PaymentMethod.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        PaymentMethod.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        PaymentMethod value = PaymentMethod.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        PaymentMethod value = PaymentMethod.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        PaymentMethod value = PaymentMethod.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        PaymentMethod value = PaymentMethod.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void customer() {
        PaymentMethod value = PaymentMethod.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void businessUnit() {
        PaymentMethod value = PaymentMethod.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void method() {
        PaymentMethod value = PaymentMethod.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void paymentInterface() {
        PaymentMethod value = PaymentMethod.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void interfaceAccount() {
        PaymentMethod value = PaymentMethod.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void token() {
        PaymentMethod value = PaymentMethod.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }

    @Test
    public void paymentMethodStatus() {
        PaymentMethod value = PaymentMethod.of();
        value.setPaymentMethodStatus(
            com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getPaymentMethodStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }

    @Test
    public void _default() {
        PaymentMethod value = PaymentMethod.of();
        value.setDefault(true);
        Assertions.assertThat(value.getDefault()).isEqualTo(true);
    }

    @Test
    public void custom() {
        PaymentMethod value = PaymentMethod.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void createdAt() {
        PaymentMethod value = PaymentMethod.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        PaymentMethod value = PaymentMethod.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        PaymentMethod value = PaymentMethod.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        PaymentMethod value = PaymentMethod.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
