
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTransactionStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTransactionStateChangeBuilder builder) {
        ChangeTransactionStateChange changeTransactionStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeTransactionStateChange).isInstanceOf(ChangeTransactionStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTransactionStateChange.builder().change("change") },
                new Object[] { "previousValue", ChangeTransactionStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial")) },
                new Object[] { "nextValue", ChangeTransactionStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial")) },
                new Object[] { "transaction",
                        ChangeTransactionStateChange.builder()
                                .transaction(
                                    new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
    }

    @Test
    public void nextValue() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
    }

    @Test
    public void transaction() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }
}
