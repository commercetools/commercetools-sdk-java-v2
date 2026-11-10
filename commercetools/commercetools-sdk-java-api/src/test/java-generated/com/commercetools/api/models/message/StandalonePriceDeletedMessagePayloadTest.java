
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceDeletedMessagePayloadBuilder builder) {
        StandalonePriceDeletedMessagePayload standalonePriceDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceDeletedMessagePayload)
                .isInstanceOf(StandalonePriceDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", StandalonePriceDeletedMessagePayload.builder().sku("sku") } };
    }

    @Test
    public void sku() {
        StandalonePriceDeletedMessagePayload value = StandalonePriceDeletedMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
