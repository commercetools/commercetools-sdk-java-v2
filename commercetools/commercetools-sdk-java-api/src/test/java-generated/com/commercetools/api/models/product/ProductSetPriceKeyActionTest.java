
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetPriceKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetPriceKeyActionBuilder builder) {
        ProductSetPriceKeyAction productSetPriceKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSetPriceKeyAction).isInstanceOf(ProductSetPriceKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceId", ProductSetPriceKeyAction.builder().priceId("priceId") },
                new Object[] { "staged", ProductSetPriceKeyAction.builder().staged(true) },
                new Object[] { "key", ProductSetPriceKeyAction.builder().key("key") } };
    }

    @Test
    public void priceId() {
        ProductSetPriceKeyAction value = ProductSetPriceKeyAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductSetPriceKeyAction value = ProductSetPriceKeyAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void key() {
        ProductSetPriceKeyAction value = ProductSetPriceKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
