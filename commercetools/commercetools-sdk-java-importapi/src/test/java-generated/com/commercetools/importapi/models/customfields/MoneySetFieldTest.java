
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneySetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MoneySetFieldBuilder builder) {
        MoneySetField moneySetField = builder.buildUnchecked();
        Assertions.assertThat(moneySetField).isInstanceOf(MoneySetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", MoneySetField.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl())) } };
    }

    @Test
    public void value() {
        MoneySetField value = MoneySetField.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl()));
    }
}
