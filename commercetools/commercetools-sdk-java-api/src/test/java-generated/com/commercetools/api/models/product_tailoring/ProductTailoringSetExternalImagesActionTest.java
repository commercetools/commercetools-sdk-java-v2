
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetExternalImagesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetExternalImagesActionBuilder builder) {
        ProductTailoringSetExternalImagesAction productTailoringSetExternalImagesAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetExternalImagesAction)
                .isInstanceOf(ProductTailoringSetExternalImagesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetExternalImagesAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetExternalImagesAction.builder().sku("sku") },
                new Object[] { "images", ProductTailoringSetExternalImagesAction.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "staged", ProductTailoringSetExternalImagesAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void staged() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
