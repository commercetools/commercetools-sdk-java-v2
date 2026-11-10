
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddTransactionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddTransactionChangeBuilder builder) {
        AddTransactionChange addTransactionChange = builder.buildUnchecked();
        Assertions.assertThat(addTransactionChange).isInstanceOf(AddTransactionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddTransactionChange.builder().change("change") },
                new Object[] { "nextValue", AddTransactionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TransactionImpl()) } };
    }

    @Test
    public void change() {
        AddTransactionChange value = AddTransactionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddTransactionChange value = AddTransactionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TransactionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TransactionImpl());
    }
}
