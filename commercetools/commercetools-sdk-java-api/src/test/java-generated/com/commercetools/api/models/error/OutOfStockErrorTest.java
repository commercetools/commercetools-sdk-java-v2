
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OutOfStockErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OutOfStockErrorBuilder builder) {
        OutOfStockError outOfStockError = builder.buildUnchecked();
        Assertions.assertThat(outOfStockError).isInstanceOf(OutOfStockError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", OutOfStockError.builder().message("message") },
                new Object[] { "lineItems",
                        OutOfStockError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { "skus", OutOfStockError.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void message() {
        OutOfStockError value = OutOfStockError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void lineItems() {
        OutOfStockError value = OutOfStockError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void skus() {
        OutOfStockError value = OutOfStockError.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
