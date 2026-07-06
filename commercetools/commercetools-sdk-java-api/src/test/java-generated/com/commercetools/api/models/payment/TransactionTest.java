
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;

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
                new Object[] { "timestamp", Transaction.builder().timestamp(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "type",
                        Transaction.builder()
                                .type(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization")) },
                new Object[] { "amount",
                        Transaction.builder()
                                .amount(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "interactionId", Transaction.builder().interactionId("interactionId") },
                new Object[] { "state",
                        Transaction.builder()
                                .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) },
                new Object[] { "custom",
                        Transaction.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "interfaceId", Transaction.builder().interfaceId("interfaceId") } };
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
        value.setTimestamp(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTimestamp()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void type() {
        Transaction value = Transaction.of();
        value.setType(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
    }

    @Test
    public void amount() {
        Transaction value = Transaction.of();
        value.setAmount(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getAmount())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
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
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }

    @Test
    public void custom() {
        Transaction value = Transaction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void interfaceId() {
        Transaction value = Transaction.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }
}
