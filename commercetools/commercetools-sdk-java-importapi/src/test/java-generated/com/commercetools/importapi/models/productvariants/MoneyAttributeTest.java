
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneyAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MoneyAttributeBuilder builder) {
        MoneyAttribute moneyAttribute = builder.buildUnchecked();
        Assertions.assertThat(moneyAttribute).isInstanceOf(MoneyAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                MoneyAttribute.builder().value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void value() {
        MoneyAttribute value = MoneyAttribute.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }
}
