
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddVariantActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddVariantActionBuilder builder) {
        ProductAddVariantAction productAddVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productAddVariantAction).isInstanceOf(ProductAddVariantAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductAddVariantAction.builder().sku("sku") },
                new Object[] { "key", ProductAddVariantAction.builder().key("key") },
                new Object[] { "prices",
                        ProductAddVariantAction.builder()
                                .prices(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { "images", ProductAddVariantAction.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "attributes",
                        ProductAddVariantAction.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "staged", ProductAddVariantAction.builder().staged(true) },
                new Object[] { "assets", ProductAddVariantAction.builder()
                        .assets(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) } };
    }

    @Test
    public void sku() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void prices() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void images() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void attributes() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void staged() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assets() {
        ProductAddVariantAction value = ProductAddVariantAction.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }
}
