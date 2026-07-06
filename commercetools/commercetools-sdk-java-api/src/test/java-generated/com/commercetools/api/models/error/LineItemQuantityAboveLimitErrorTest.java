
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemQuantityAboveLimitErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemQuantityAboveLimitErrorBuilder builder) {
        LineItemQuantityAboveLimitError lineItemQuantityAboveLimitError = builder.buildUnchecked();
        Assertions.assertThat(lineItemQuantityAboveLimitError).isInstanceOf(LineItemQuantityAboveLimitError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", LineItemQuantityAboveLimitError.builder().message("message") },
                new Object[] { "quantity", LineItemQuantityAboveLimitError.builder().quantity(8) },
                new Object[] { "maxCartQuantity", LineItemQuantityAboveLimitError.builder().maxCartQuantity(4) },
                new Object[] { "lineItem", LineItemQuantityAboveLimitError.builder().lineItem("lineItem") } };
    }

    @Test
    public void message() {
        LineItemQuantityAboveLimitError value = LineItemQuantityAboveLimitError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void quantity() {
        LineItemQuantityAboveLimitError value = LineItemQuantityAboveLimitError.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void maxCartQuantity() {
        LineItemQuantityAboveLimitError value = LineItemQuantityAboveLimitError.of();
        value.setMaxCartQuantity(4);
        Assertions.assertThat(value.getMaxCartQuantity()).isEqualTo(4);
    }

    @Test
    public void lineItem() {
        LineItemQuantityAboveLimitError value = LineItemQuantityAboveLimitError.of();
        value.setLineItem("lineItem");
        Assertions.assertThat(value.getLineItem()).isEqualTo("lineItem");
    }
}
