
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTransactionCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTransactionCustomTypeChangeBuilder builder) {
        SetTransactionCustomTypeChange setTransactionCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setTransactionCustomTypeChange).isInstanceOf(SetTransactionCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTransactionCustomTypeChange.builder().change("change") },
                new Object[] { "transaction", SetTransactionCustomTypeChange.builder()
                        .transaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) },
                new Object[] { "previousValue",
                        SetTransactionCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetTransactionCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetTransactionCustomTypeChange value = SetTransactionCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void transaction() {
        SetTransactionCustomTypeChange value = SetTransactionCustomTypeChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }

    @Test
    public void previousValue() {
        SetTransactionCustomTypeChange value = SetTransactionCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetTransactionCustomTypeChange value = SetTransactionCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
