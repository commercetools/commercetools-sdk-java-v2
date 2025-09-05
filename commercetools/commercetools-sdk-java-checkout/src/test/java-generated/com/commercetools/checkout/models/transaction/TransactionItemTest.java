
package com.commercetools.checkout.models.transaction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionItemBuilder builder) {
        TransactionItem transactionItem = builder.buildUnchecked();
        Assertions.assertThat(transactionItem).isInstanceOf(TransactionItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "payment",
                        TransactionItem.builder()
                                .payment(new com.commercetools.checkout.models.payment.PaymentReferenceImpl()) },
                new Object[] { "paymentIntegration", TransactionItem.builder()
                        .paymentIntegration(
                            new com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceImpl()) },
                new Object[] { "amount",
                        TransactionItem.builder().amount(new com.commercetools.checkout.models.common.AmountImpl()) } };
    }

    @Test
    public void payment() {
        TransactionItem value = TransactionItem.of();
        value.setPayment(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
    }

    @Test
    public void paymentIntegration() {
        TransactionItem value = TransactionItem.of();
        value.setPaymentIntegration(
            new com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceImpl());
        Assertions.assertThat(value.getPaymentIntegration())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceImpl());
    }

    @Test
    public void amount() {
        TransactionItem value = TransactionItem.of();
        value.setAmount(new com.commercetools.checkout.models.common.AmountImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.checkout.models.common.AmountImpl());
    }
}
