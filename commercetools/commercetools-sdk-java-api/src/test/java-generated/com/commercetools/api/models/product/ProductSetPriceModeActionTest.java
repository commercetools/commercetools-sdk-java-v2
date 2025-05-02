
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetPriceModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetPriceModeActionBuilder builder) {
        ProductSetPriceModeAction productSetPriceModeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetPriceModeAction).isInstanceOf(ProductSetPriceModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceMode", ProductSetPriceModeAction.builder()
                .priceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) } };
    }

    @Test
    public void priceMode() {
        ProductSetPriceModeAction value = ProductSetPriceModeAction.of();
        value.setPriceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
    }
}
