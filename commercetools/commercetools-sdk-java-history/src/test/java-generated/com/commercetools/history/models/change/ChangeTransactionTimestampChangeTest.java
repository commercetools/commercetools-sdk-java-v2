
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTransactionTimestampChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTransactionTimestampChangeBuilder builder) {
        ChangeTransactionTimestampChange changeTransactionTimestampChange = builder.buildUnchecked();
        Assertions.assertThat(changeTransactionTimestampChange).isInstanceOf(ChangeTransactionTimestampChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTransactionTimestampChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeTransactionTimestampChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeTransactionTimestampChange.builder().nextValue("nextValue") },
                new Object[] { "transaction",
                        ChangeTransactionTimestampChange.builder()
                                .transaction(
                                    new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void transaction() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }
}
