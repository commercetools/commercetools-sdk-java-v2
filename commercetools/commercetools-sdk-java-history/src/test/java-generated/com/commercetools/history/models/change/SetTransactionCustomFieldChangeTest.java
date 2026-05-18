
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTransactionCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTransactionCustomFieldChangeBuilder builder) {
        SetTransactionCustomFieldChange setTransactionCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setTransactionCustomFieldChange).isInstanceOf(SetTransactionCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTransactionCustomFieldChange.builder().change("change") },
                new Object[] { "transaction", SetTransactionCustomFieldChange.builder()
                        .transaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) },
                new Object[] { "name", SetTransactionCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId", SetTransactionCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetTransactionCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetTransactionCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetTransactionCustomFieldChange value = SetTransactionCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void transaction() {
        SetTransactionCustomFieldChange value = SetTransactionCustomFieldChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }

    @Test
    public void name() {
        SetTransactionCustomFieldChange value = SetTransactionCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetTransactionCustomFieldChange value = SetTransactionCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetTransactionCustomFieldChange value = SetTransactionCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetTransactionCustomFieldChange value = SetTransactionCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
