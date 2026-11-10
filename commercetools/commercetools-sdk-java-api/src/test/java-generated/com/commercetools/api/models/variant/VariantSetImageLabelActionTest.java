
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetImageLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetImageLabelActionBuilder builder) {
        VariantSetImageLabelAction variantSetImageLabelAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetImageLabelAction).isInstanceOf(VariantSetImageLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "imageUrl", VariantSetImageLabelAction.builder().imageUrl("imageUrl") },
                new Object[] { "label", VariantSetImageLabelAction.builder().label("label") },
                new Object[] { "staged", VariantSetImageLabelAction.builder().staged(true) } };
    }

    @Test
    public void imageUrl() {
        VariantSetImageLabelAction value = VariantSetImageLabelAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void label() {
        VariantSetImageLabelAction value = VariantSetImageLabelAction.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }

    @Test
    public void staged() {
        VariantSetImageLabelAction value = VariantSetImageLabelAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
