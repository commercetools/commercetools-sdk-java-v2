
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentDraftBuilder builder) {
        MyPaymentDraft myPaymentDraft = builder.buildUnchecked();
        Assertions.assertThat(myPaymentDraft).isInstanceOf(MyPaymentDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "amountPlanned",
                        MyPaymentDraft.builder().amountPlanned(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "paymentMethodInfo",
                        MyPaymentDraft.builder()
                                .paymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl()) },
                new Object[] { "custom",
                        MyPaymentDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "transaction", MyPaymentDraft.builder()
                        .transaction(new com.commercetools.api.models.me.MyTransactionDraftImpl()) } };
    }

    @Test
    public void amountPlanned() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setAmountPlanned(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmountPlanned()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void paymentMethodInfo() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setPaymentMethodInfo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
        Assertions.assertThat(value.getPaymentMethodInfo())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentMethodInfoImpl());
    }

    @Test
    public void custom() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void transaction() {
        MyPaymentDraft value = MyPaymentDraft.of();
        value.setTransaction(new com.commercetools.api.models.me.MyTransactionDraftImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.api.models.me.MyTransactionDraftImpl());
    }
}
