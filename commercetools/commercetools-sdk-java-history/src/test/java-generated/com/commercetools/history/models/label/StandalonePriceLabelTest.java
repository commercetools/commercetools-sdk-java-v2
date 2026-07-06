
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceLabelBuilder builder) {
        StandalonePriceLabel standalonePriceLabel = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceLabel).isInstanceOf(StandalonePriceLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StandalonePriceLabel.builder().key("key") },
                new Object[] { "sku", StandalonePriceLabel.builder().sku("sku") } };
    }

    @Test
    public void key() {
        StandalonePriceLabel value = StandalonePriceLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        StandalonePriceLabel value = StandalonePriceLabel.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
