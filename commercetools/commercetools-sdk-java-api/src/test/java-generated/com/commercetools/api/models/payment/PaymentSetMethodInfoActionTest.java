
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoActionBuilder builder) {
        PaymentSetMethodInfoAction paymentSetMethodInfoAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoAction).isInstanceOf(PaymentSetMethodInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentInterface",
                        PaymentSetMethodInfoAction.builder().paymentInterface("paymentInterface") },
                new Object[] { "method", PaymentSetMethodInfoAction.builder().method("method") },
                new Object[] { "name",
                        PaymentSetMethodInfoAction.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "token",
                        PaymentSetMethodInfoAction.builder()
                                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) },
                new Object[] { "interfaceAccount",
                        PaymentSetMethodInfoAction.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "custom", PaymentSetMethodInfoAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void paymentInterface() {
        PaymentSetMethodInfoAction value = PaymentSetMethodInfoAction.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void method() {
        PaymentSetMethodInfoAction value = PaymentSetMethodInfoAction.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void name() {
        PaymentSetMethodInfoAction value = PaymentSetMethodInfoAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void token() {
        PaymentSetMethodInfoAction value = PaymentSetMethodInfoAction.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }

    @Test
    public void interfaceAccount() {
        PaymentSetMethodInfoAction value = PaymentSetMethodInfoAction.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void custom() {
        PaymentSetMethodInfoAction value = PaymentSetMethodInfoAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
