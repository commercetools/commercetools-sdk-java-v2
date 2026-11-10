
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddExternalImageActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddExternalImageActionBuilder builder) {
        ProductAddExternalImageAction productAddExternalImageAction = builder.buildUnchecked();
        Assertions.assertThat(productAddExternalImageAction).isInstanceOf(ProductAddExternalImageAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductAddExternalImageAction.builder().variantId(5L) },
                new Object[] { "sku", ProductAddExternalImageAction.builder().sku("sku") },
                new Object[] { "image",
                        ProductAddExternalImageAction.builder()
                                .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", ProductAddExternalImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void image() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
