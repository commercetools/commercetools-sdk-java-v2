
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchStringValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchStringValueBuilder builder) {
        OrderSearchStringValue orderSearchStringValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchStringValue).isInstanceOf(OrderSearchStringValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", OrderSearchStringValue.builder().value("value") },
                new Object[] { "language", OrderSearchStringValue.builder().language("language") },
                new Object[] { "caseInsensitive", OrderSearchStringValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        OrderSearchStringValue value = OrderSearchStringValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        OrderSearchStringValue value = OrderSearchStringValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        OrderSearchStringValue value = OrderSearchStringValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
