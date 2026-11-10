
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantMoveImageToPositionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantMoveImageToPositionActionBuilder builder) {
        VariantMoveImageToPositionAction variantMoveImageToPositionAction = builder.buildUnchecked();
        Assertions.assertThat(variantMoveImageToPositionAction).isInstanceOf(VariantMoveImageToPositionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "imageUrl", VariantMoveImageToPositionAction.builder().imageUrl("imageUrl") },
                new Object[] { "position", VariantMoveImageToPositionAction.builder().position(4L) },
                new Object[] { "staged", VariantMoveImageToPositionAction.builder().staged(true) } };
    }

    @Test
    public void imageUrl() {
        VariantMoveImageToPositionAction value = VariantMoveImageToPositionAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void position() {
        VariantMoveImageToPositionAction value = VariantMoveImageToPositionAction.of();
        value.setPosition(4L);
        Assertions.assertThat(value.getPosition()).isEqualTo(4L);
    }

    @Test
    public void staged() {
        VariantMoveImageToPositionAction value = VariantMoveImageToPositionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
