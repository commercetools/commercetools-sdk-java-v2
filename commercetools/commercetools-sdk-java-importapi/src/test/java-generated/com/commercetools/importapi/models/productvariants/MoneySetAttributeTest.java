
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneySetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MoneySetAttributeBuilder builder) {
        MoneySetAttribute moneySetAttribute = builder.buildUnchecked();
        Assertions.assertThat(moneySetAttribute).isInstanceOf(MoneySetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", MoneySetAttribute.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl())) } };
    }

    @Test
    public void value() {
        MoneySetAttribute value = MoneySetAttribute.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.TypedMoneyImpl()));
    }
}
