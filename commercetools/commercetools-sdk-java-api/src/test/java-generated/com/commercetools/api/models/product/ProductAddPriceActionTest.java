
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddPriceActionBuilder builder) {
        ProductAddPriceAction productAddPriceAction = builder.buildUnchecked();
        Assertions.assertThat(productAddPriceAction).isInstanceOf(ProductAddPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductAddPriceAction.builder().variantId(5L) },
                new Object[] { "sku", ProductAddPriceAction.builder().sku("sku") },
                new Object[] { "price",
                        ProductAddPriceAction.builder()
                                .price(new com.commercetools.api.models.common.PriceDraftImpl()) },
                new Object[] { "staged", ProductAddPriceAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void price() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setPrice(new com.commercetools.api.models.common.PriceDraftImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceDraftImpl());
    }

    @Test
    public void staged() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
