
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetPricesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetPricesActionBuilder builder) {
        ProductSetPricesAction productSetPricesAction = builder.buildUnchecked();
        Assertions.assertThat(productSetPricesAction).isInstanceOf(ProductSetPricesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetPricesAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetPricesAction.builder().sku("sku") },
                new Object[] { "prices",
                        ProductSetPricesAction.builder()
                                .prices(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { "staged", ProductSetPricesAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void prices() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void staged() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
