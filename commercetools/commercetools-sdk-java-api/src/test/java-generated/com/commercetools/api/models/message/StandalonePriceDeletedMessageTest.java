
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceDeletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceDeletedMessageBuilder builder) {
        StandalonePriceDeletedMessage standalonePriceDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceDeletedMessage).isInstanceOf(StandalonePriceDeletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", StandalonePriceDeletedMessage.builder().sku("sku") } };
    }

    @Test
    public void sku() {
        StandalonePriceDeletedMessage value = StandalonePriceDeletedMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
