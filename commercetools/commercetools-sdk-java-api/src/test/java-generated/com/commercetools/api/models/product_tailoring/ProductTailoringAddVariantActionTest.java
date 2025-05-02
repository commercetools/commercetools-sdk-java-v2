
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringAddVariantActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringAddVariantActionBuilder builder) {
        ProductTailoringAddVariantAction productTailoringAddVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAddVariantAction).isInstanceOf(ProductTailoringAddVariantAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTailoringAddVariantAction.builder().id(2L) },
                new Object[] { "sku", ProductTailoringAddVariantAction.builder().sku("sku") },
                new Object[] { "images", ProductTailoringAddVariantAction.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "assets",
                        ProductTailoringAddVariantAction.builder()
                                .assets(Collections
                                        .singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) },
                new Object[] { "attributes", ProductTailoringAddVariantAction.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl())) },
                new Object[] { "staged", ProductTailoringAddVariantAction.builder().staged(true) } };
    }

    @Test
    public void id() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }

    @Test
    public void attributes() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setAttributes(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
    }

    @Test
    public void staged() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
