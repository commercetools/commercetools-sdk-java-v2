
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductMoveImageToPositionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductMoveImageToPositionActionBuilder builder) {
        ProductMoveImageToPositionAction productMoveImageToPositionAction = builder.buildUnchecked();
        Assertions.assertThat(productMoveImageToPositionAction).isInstanceOf(ProductMoveImageToPositionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductMoveImageToPositionAction.builder().variantId(5L) },
                new Object[] { "sku", ProductMoveImageToPositionAction.builder().sku("sku") },
                new Object[] { "imageUrl", ProductMoveImageToPositionAction.builder().imageUrl("imageUrl") },
                new Object[] { "position", ProductMoveImageToPositionAction.builder().position(4L) },
                new Object[] { "staged", ProductMoveImageToPositionAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void position() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setPosition(4L);
        Assertions.assertThat(value.getPosition()).isEqualTo(4L);
    }

    @Test
    public void staged() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
