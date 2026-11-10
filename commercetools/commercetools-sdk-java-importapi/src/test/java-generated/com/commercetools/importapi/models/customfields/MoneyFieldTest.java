
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneyFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MoneyFieldBuilder builder) {
        MoneyField moneyField = builder.buildUnchecked();
        Assertions.assertThat(moneyField).isInstanceOf(MoneyField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                MoneyField.builder().value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void value() {
        MoneyField value = MoneyField.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }
}
