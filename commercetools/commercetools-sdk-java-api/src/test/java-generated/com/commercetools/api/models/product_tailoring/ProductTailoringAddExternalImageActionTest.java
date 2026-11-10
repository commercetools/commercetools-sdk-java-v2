
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringAddExternalImageActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringAddExternalImageActionBuilder builder) {
        ProductTailoringAddExternalImageAction productTailoringAddExternalImageAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAddExternalImageAction)
                .isInstanceOf(ProductTailoringAddExternalImageAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringAddExternalImageAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringAddExternalImageAction.builder().sku("sku") },
                new Object[] { "image",
                        ProductTailoringAddExternalImageAction.builder()
                                .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", ProductTailoringAddExternalImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void image() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
