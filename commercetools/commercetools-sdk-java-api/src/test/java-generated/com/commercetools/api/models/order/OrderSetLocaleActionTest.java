
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetLocaleActionBuilder builder) {
        OrderSetLocaleAction orderSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetLocaleAction).isInstanceOf(OrderSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", OrderSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        OrderSetLocaleAction value = OrderSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
