
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetImageLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetImageLabelActionBuilder builder) {
        ProductSetImageLabelAction productSetImageLabelAction = builder.buildUnchecked();
        Assertions.assertThat(productSetImageLabelAction).isInstanceOf(ProductSetImageLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductSetImageLabelAction.builder().sku("sku") },
                new Object[] { "variantId", ProductSetImageLabelAction.builder().variantId(5L) },
                new Object[] { "imageUrl", ProductSetImageLabelAction.builder().imageUrl("imageUrl") },
                new Object[] { "label", ProductSetImageLabelAction.builder().label("label") },
                new Object[] { "staged", ProductSetImageLabelAction.builder().staged(true) } };
    }

    @Test
    public void sku() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void variantId() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void imageUrl() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void label() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }

    @Test
    public void staged() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
