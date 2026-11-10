
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAddExternalImageActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAddExternalImageActionBuilder builder) {
        VariantAddExternalImageAction variantAddExternalImageAction = builder.buildUnchecked();
        Assertions.assertThat(variantAddExternalImageAction).isInstanceOf(VariantAddExternalImageAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "image",
                        VariantAddExternalImageAction.builder()
                                .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", VariantAddExternalImageAction.builder().staged(true) } };
    }

    @Test
    public void image() {
        VariantAddExternalImageAction value = VariantAddExternalImageAction.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        VariantAddExternalImageAction value = VariantAddExternalImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
