
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemQuantityBelowLimitErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemQuantityBelowLimitErrorBuilder builder) {
        LineItemQuantityBelowLimitError lineItemQuantityBelowLimitError = builder.buildUnchecked();
        Assertions.assertThat(lineItemQuantityBelowLimitError).isInstanceOf(LineItemQuantityBelowLimitError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", LineItemQuantityBelowLimitError.builder().message("message") },
                new Object[] { "quantity", LineItemQuantityBelowLimitError.builder().quantity(8) },
                new Object[] { "minCartQuantity", LineItemQuantityBelowLimitError.builder().minCartQuantity(6) },
                new Object[] { "lineItem", LineItemQuantityBelowLimitError.builder().lineItem("lineItem") } };
    }

    @Test
    public void message() {
        LineItemQuantityBelowLimitError value = LineItemQuantityBelowLimitError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void quantity() {
        LineItemQuantityBelowLimitError value = LineItemQuantityBelowLimitError.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void minCartQuantity() {
        LineItemQuantityBelowLimitError value = LineItemQuantityBelowLimitError.of();
        value.setMinCartQuantity(6);
        Assertions.assertThat(value.getMinCartQuantity()).isEqualTo(6);
    }

    @Test
    public void lineItem() {
        LineItemQuantityBelowLimitError value = LineItemQuantityBelowLimitError.of();
        value.setLineItem("lineItem");
        Assertions.assertThat(value.getLineItem()).isEqualTo("lineItem");
    }
}
