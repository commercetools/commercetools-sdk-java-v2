
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionChangeValueBuilder builder) {
        TransactionChangeValue transactionChangeValue = builder.buildUnchecked();
        Assertions.assertThat(transactionChangeValue).isInstanceOf(TransactionChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TransactionChangeValue.builder().id("id") },
                new Object[] { "interactionId", TransactionChangeValue.builder().interactionId("interactionId") },
                new Object[] { "timestamp", TransactionChangeValue.builder().timestamp("timestamp") } };
    }

    @Test
    public void id() {
        TransactionChangeValue value = TransactionChangeValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void interactionId() {
        TransactionChangeValue value = TransactionChangeValue.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }

    @Test
    public void timestamp() {
        TransactionChangeValue value = TransactionChangeValue.of();
        value.setTimestamp("timestamp");
        Assertions.assertThat(value.getTimestamp()).isEqualTo("timestamp");
    }
}
