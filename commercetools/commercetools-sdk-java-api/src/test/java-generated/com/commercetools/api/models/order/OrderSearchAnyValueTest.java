
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchAnyValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchAnyValueBuilder builder) {
        OrderSearchAnyValue orderSearchAnyValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchAnyValue).isInstanceOf(OrderSearchAnyValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", OrderSearchAnyValue.builder().value("value") },
                new Object[] { "language", OrderSearchAnyValue.builder().language("language") },
                new Object[] { "caseInsensitive", OrderSearchAnyValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        OrderSearchAnyValue value = OrderSearchAnyValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        OrderSearchAnyValue value = OrderSearchAnyValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        OrderSearchAnyValue value = OrderSearchAnyValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
