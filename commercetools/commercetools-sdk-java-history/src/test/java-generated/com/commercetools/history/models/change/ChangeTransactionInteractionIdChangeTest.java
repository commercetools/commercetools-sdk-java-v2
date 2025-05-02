
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTransactionInteractionIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTransactionInteractionIdChangeBuilder builder) {
        ChangeTransactionInteractionIdChange changeTransactionInteractionIdChange = builder.buildUnchecked();
        Assertions.assertThat(changeTransactionInteractionIdChange)
                .isInstanceOf(ChangeTransactionInteractionIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeTransactionInteractionIdChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeTransactionInteractionIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeTransactionInteractionIdChange.builder().nextValue("nextValue") },
                new Object[] { "transaction",
                        ChangeTransactionInteractionIdChange.builder()
                                .transaction(
                                    new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void transaction() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }
}
