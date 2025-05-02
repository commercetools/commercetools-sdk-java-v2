
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionBuilder builder) {
        Transaction transaction = builder.buildUnchecked();
        Assertions.assertThat(transaction).isInstanceOf(Transaction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Transaction.builder().id("id") },
                new Object[] { "timestamp", Transaction.builder().timestamp("timestamp") },
                new Object[] { "type",
                        Transaction.builder()
                                .type(com.commercetools.history.models.common.TransactionType
                                        .findEnum("Authorization")) },
                new Object[] { "amount",
                        Transaction.builder().amount(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "interactionId", Transaction.builder().interactionId("interactionId") },
                new Object[] { "state", Transaction.builder()
                        .state(com.commercetools.history.models.common.TransactionState.findEnum("Initial")) } };
    }

    @Test
    public void id() {
        Transaction value = Transaction.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void timestamp() {
        Transaction value = Transaction.of();
        value.setTimestamp("timestamp");
        Assertions.assertThat(value.getTimestamp()).isEqualTo("timestamp");
    }

    @Test
    public void type() {
        Transaction value = Transaction.of();
        value.setType(com.commercetools.history.models.common.TransactionType.findEnum("Authorization"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.history.models.common.TransactionType.findEnum("Authorization"));
    }

    @Test
    public void amount() {
        Transaction value = Transaction.of();
        value.setAmount(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void interactionId() {
        Transaction value = Transaction.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }

    @Test
    public void state() {
        Transaction value = Transaction.of();
        value.setState(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
    }
}
