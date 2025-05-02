
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceChangedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceChangedErrorBuilder builder) {
        PriceChangedError priceChangedError = builder.buildUnchecked();
        Assertions.assertThat(priceChangedError).isInstanceOf(PriceChangedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", PriceChangedError.builder().message("message") },
                new Object[] { "lineItems",
                        PriceChangedError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { "shipping", PriceChangedError.builder().shipping(true) } };
    }

    @Test
    public void message() {
        PriceChangedError value = PriceChangedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void lineItems() {
        PriceChangedError value = PriceChangedError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void shipping() {
        PriceChangedError value = PriceChangedError.of();
        value.setShipping(true);
        Assertions.assertThat(value.getShipping()).isEqualTo(true);
    }
}
