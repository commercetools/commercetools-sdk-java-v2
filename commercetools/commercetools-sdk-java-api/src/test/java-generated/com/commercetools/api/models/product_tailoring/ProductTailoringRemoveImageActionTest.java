
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringRemoveImageActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringRemoveImageActionBuilder builder) {
        ProductTailoringRemoveImageAction productTailoringRemoveImageAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringRemoveImageAction).isInstanceOf(ProductTailoringRemoveImageAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductTailoringRemoveImageAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringRemoveImageAction.builder().sku("sku") },
                new Object[] { "imageUrl", ProductTailoringRemoveImageAction.builder().imageUrl("imageUrl") },
                new Object[] { "staged", ProductTailoringRemoveImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void staged() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
