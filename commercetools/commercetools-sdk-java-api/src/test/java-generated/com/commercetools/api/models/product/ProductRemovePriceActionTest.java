
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemovePriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemovePriceActionBuilder builder) {
        ProductRemovePriceAction productRemovePriceAction = builder.buildUnchecked();
        Assertions.assertThat(productRemovePriceAction).isInstanceOf(ProductRemovePriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceId", ProductRemovePriceAction.builder().priceId("priceId") },
                new Object[] { "staged", ProductRemovePriceAction.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductRemovePriceAction value = ProductRemovePriceAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductRemovePriceAction value = ProductRemovePriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
