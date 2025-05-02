
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetImageLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetImageLabelActionBuilder builder) {
        ProductTailoringSetImageLabelAction productTailoringSetImageLabelAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetImageLabelAction)
                .isInstanceOf(ProductTailoringSetImageLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductTailoringSetImageLabelAction.builder().sku("sku") },
                new Object[] { "variantId", ProductTailoringSetImageLabelAction.builder().variantId(5L) },
                new Object[] { "imageUrl", ProductTailoringSetImageLabelAction.builder().imageUrl("imageUrl") },
                new Object[] { "label", ProductTailoringSetImageLabelAction.builder().label("label") },
                new Object[] { "staged", ProductTailoringSetImageLabelAction.builder().staged(true) } };
    }

    @Test
    public void sku() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void variantId() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void imageUrl() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void label() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }

    @Test
    public void staged() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
