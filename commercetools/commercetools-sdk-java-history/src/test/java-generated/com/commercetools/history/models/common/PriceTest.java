
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceBuilder builder) {
        Price price = builder.buildUnchecked();
        Assertions.assertThat(price).isInstanceOf(Price.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Price.builder().id("id") }, new Object[] { "value",
                Price.builder().value(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void id() {
        Price value = Price.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void value() {
        Price value = Price.of();
        value.setValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
