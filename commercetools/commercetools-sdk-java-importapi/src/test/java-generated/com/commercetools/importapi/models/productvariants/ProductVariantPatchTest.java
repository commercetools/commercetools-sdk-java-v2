
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantPatchTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantPatchBuilder builder) {
        ProductVariantPatch productVariantPatch = builder.buildUnchecked();
        Assertions.assertThat(productVariantPatch).isInstanceOf(ProductVariantPatch.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "productVariant",
                        ProductVariantPatch.builder()
                                .productVariant(
                                    new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl()) },
                new Object[] { "attributes",
                        ProductVariantPatch.builder()
                                .attributes(new com.commercetools.importapi.models.productvariants.AttributesImpl()) },
                new Object[] { "staged", ProductVariantPatch.builder().staged(true) },
                new Object[] { "product", ProductVariantPatch.builder()
                        .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) } };
    }

    @Test
    public void productVariant() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setProductVariant(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
        Assertions.assertThat(value.getProductVariant())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
    }

    @Test
    public void attributes() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setAttributes(new com.commercetools.importapi.models.productvariants.AttributesImpl());
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(new com.commercetools.importapi.models.productvariants.AttributesImpl());
    }

    @Test
    public void staged() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void product() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }
}
