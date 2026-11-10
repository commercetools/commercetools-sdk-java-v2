
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantDraftBuilder builder) {
        VariantDraft variantDraft = builder.buildUnchecked();
        Assertions.assertThat(variantDraft).isInstanceOf(VariantDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", VariantDraft.builder().key("key") },
                new Object[] { "sku", VariantDraft.builder().sku("sku") },
                new Object[] { "product",
                        VariantDraft.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "publish", VariantDraft.builder().publish(true) },
                new Object[] { "images", VariantDraft.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "attributes",
                        VariantDraft.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "assets", VariantDraft.builder()
                        .assets(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) } };
    }

    @Test
    public void key() {
        VariantDraft value = VariantDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        VariantDraft value = VariantDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void product() {
        VariantDraft value = VariantDraft.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void publish() {
        VariantDraft value = VariantDraft.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void images() {
        VariantDraft value = VariantDraft.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void attributes() {
        VariantDraft value = VariantDraft.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void assets() {
        VariantDraft value = VariantDraft.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }
}
