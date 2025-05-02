
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemoveImageActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemoveImageActionBuilder builder) {
        ProductRemoveImageAction productRemoveImageAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveImageAction).isInstanceOf(ProductRemoveImageAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductRemoveImageAction.builder().variantId(5L) },
                new Object[] { "sku", ProductRemoveImageAction.builder().sku("sku") },
                new Object[] { "imageUrl", ProductRemoveImageAction.builder().imageUrl("imageUrl") },
                new Object[] { "staged", ProductRemoveImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void staged() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
