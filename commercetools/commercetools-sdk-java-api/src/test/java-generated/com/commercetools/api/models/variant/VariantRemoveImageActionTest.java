
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantRemoveImageActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantRemoveImageActionBuilder builder) {
        VariantRemoveImageAction variantRemoveImageAction = builder.buildUnchecked();
        Assertions.assertThat(variantRemoveImageAction).isInstanceOf(VariantRemoveImageAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "imageUrl", VariantRemoveImageAction.builder().imageUrl("imageUrl") },
                new Object[] { "staged", VariantRemoveImageAction.builder().staged(true) } };
    }

    @Test
    public void imageUrl() {
        VariantRemoveImageAction value = VariantRemoveImageAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void staged() {
        VariantRemoveImageAction value = VariantRemoveImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
