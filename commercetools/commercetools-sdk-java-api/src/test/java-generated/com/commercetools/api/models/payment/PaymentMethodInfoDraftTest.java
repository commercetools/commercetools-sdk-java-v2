
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoDraftBuilder builder) {
        PaymentMethodInfoDraft paymentMethodInfoDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoDraft).isInstanceOf(PaymentMethodInfoDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentInterface",
                        PaymentMethodInfoDraft.builder().paymentInterface("paymentInterface") },
                new Object[] { "method", PaymentMethodInfoDraft.builder().method("method") },
                new Object[] { "name",
                        PaymentMethodInfoDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "token",
                        PaymentMethodInfoDraft.builder()
                                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) },
                new Object[] { "interfaceAccount",
                        PaymentMethodInfoDraft.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "custom", PaymentMethodInfoDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void paymentInterface() {
        PaymentMethodInfoDraft value = PaymentMethodInfoDraft.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void method() {
        PaymentMethodInfoDraft value = PaymentMethodInfoDraft.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void name() {
        PaymentMethodInfoDraft value = PaymentMethodInfoDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void token() {
        PaymentMethodInfoDraft value = PaymentMethodInfoDraft.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodInfoDraft value = PaymentMethodInfoDraft.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void custom() {
        PaymentMethodInfoDraft value = PaymentMethodInfoDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
