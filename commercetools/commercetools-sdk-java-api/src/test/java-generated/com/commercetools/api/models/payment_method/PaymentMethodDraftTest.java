
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodDraftBuilder builder) {
        PaymentMethodDraft paymentMethodDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodDraft).isInstanceOf(PaymentMethodDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentMethodDraft.builder().key("key") },
                new Object[] { "name",
                        PaymentMethodDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "customer",
                        PaymentMethodDraft.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "businessUnit", PaymentMethodDraft.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "method", PaymentMethodDraft.builder().method("method") },
                new Object[] { "paymentInterface", PaymentMethodDraft.builder().paymentInterface("paymentInterface") },
                new Object[] { "interfaceAccount", PaymentMethodDraft.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "token",
                        PaymentMethodDraft.builder()
                                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) },
                new Object[] { "paymentMethodStatus",
                        PaymentMethodDraft.builder()
                                .paymentMethodStatus(com.commercetools.api.models.payment_method.PaymentMethodStatus
                                        .findEnum("Active")) },
                new Object[] { "default", PaymentMethodDraft.builder()._default(true) },
                new Object[] { "custom", PaymentMethodDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void customer() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void businessUnit() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void method() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void paymentInterface() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void token() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }

    @Test
    public void paymentMethodStatus() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setPaymentMethodStatus(
            com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getPaymentMethodStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }

    @Test
    public void _default() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setDefault(true);
        Assertions.assertThat(value.getDefault()).isEqualTo(true);
    }

    @Test
    public void custom() {
        PaymentMethodDraft value = PaymentMethodDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
