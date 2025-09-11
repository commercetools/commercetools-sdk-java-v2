
package com.commercetools.checkout.models.transaction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionItemDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionItemDraftBuilder builder) {
        TransactionItemDraft transactionItemDraft = builder.buildUnchecked();
        Assertions.assertThat(transactionItemDraft).isInstanceOf(TransactionItemDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentIntegration", TransactionItemDraft.builder()
                .paymentIntegration(
                    new com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierImpl()) },
                new Object[] { "amount", TransactionItemDraft.builder()
                        .amount(new com.commercetools.checkout.models.common.AmountImpl()) } };
    }

    @Test
    public void paymentIntegration() {
        TransactionItemDraft value = TransactionItemDraft.of();
        value.setPaymentIntegration(
            new com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierImpl());
        Assertions.assertThat(value.getPaymentIntegration())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierImpl());
    }

    @Test
    public void amount() {
        TransactionItemDraft value = TransactionItemDraft.of();
        value.setAmount(new com.commercetools.checkout.models.common.AmountImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.checkout.models.common.AmountImpl());
    }
}
