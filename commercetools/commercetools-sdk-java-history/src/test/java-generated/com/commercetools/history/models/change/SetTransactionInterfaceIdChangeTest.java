
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTransactionInterfaceIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTransactionInterfaceIdChangeBuilder builder) {
        SetTransactionInterfaceIdChange setTransactionInterfaceIdChange = builder.buildUnchecked();
        Assertions.assertThat(setTransactionInterfaceIdChange).isInstanceOf(SetTransactionInterfaceIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTransactionInterfaceIdChange.builder().change("change") },
                new Object[] { "transaction", SetTransactionInterfaceIdChange.builder()
                        .transaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) },
                new Object[] { "previousValue",
                        SetTransactionInterfaceIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetTransactionInterfaceIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetTransactionInterfaceIdChange value = SetTransactionInterfaceIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void transaction() {
        SetTransactionInterfaceIdChange value = SetTransactionInterfaceIdChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }

    @Test
    public void previousValue() {
        SetTransactionInterfaceIdChange value = SetTransactionInterfaceIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetTransactionInterfaceIdChange value = SetTransactionInterfaceIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
