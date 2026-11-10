
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringMoveImageToPositionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringMoveImageToPositionActionBuilder builder) {
        ProductTailoringMoveImageToPositionAction productTailoringMoveImageToPositionAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringMoveImageToPositionAction)
                .isInstanceOf(ProductTailoringMoveImageToPositionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringMoveImageToPositionAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringMoveImageToPositionAction.builder().sku("sku") },
                new Object[] { "imageUrl", ProductTailoringMoveImageToPositionAction.builder().imageUrl("imageUrl") },
                new Object[] { "position", ProductTailoringMoveImageToPositionAction.builder().position(4L) },
                new Object[] { "staged", ProductTailoringMoveImageToPositionAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void position() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setPosition(4L);
        Assertions.assertThat(value.getPosition()).isEqualTo(4L);
    }

    @Test
    public void staged() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
