
package com.commercetools.checkout.models.transaction;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionStatusTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionStatusBuilder builder) {
        TransactionStatus transactionStatus = builder.buildUnchecked();
        Assertions.assertThat(transactionStatus).isInstanceOf(TransactionStatus.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        TransactionStatus.builder()
                                .state(com.commercetools.checkout.models.transaction.TransactionState
                                        .findEnum("Initial")) },
                new Object[] { "errors",
                        TransactionStatus.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.checkout.models.transaction.TransactionErrorImpl())) } };
    }

    @Test
    public void state() {
        TransactionStatus value = TransactionStatus.of();
        value.setState(com.commercetools.checkout.models.transaction.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.checkout.models.transaction.TransactionState.findEnum("Initial"));
    }

    @Test
    public void errors() {
        TransactionStatus value = TransactionStatus.of();
        value.setErrors(
            Collections.singletonList(new com.commercetools.checkout.models.transaction.TransactionErrorImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.checkout.models.transaction.TransactionErrorImpl()));
    }
}
