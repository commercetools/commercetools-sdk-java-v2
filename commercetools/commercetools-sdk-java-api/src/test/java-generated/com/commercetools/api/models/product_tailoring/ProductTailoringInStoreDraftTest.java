
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringInStoreDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringInStoreDraftBuilder builder) {
        ProductTailoringInStoreDraft productTailoringInStoreDraft = builder.buildUnchecked();
        Assertions.assertThat(productTailoringInStoreDraft).isInstanceOf(ProductTailoringInStoreDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTailoringInStoreDraft.builder().key("key") },
                new Object[] { "product",
                        ProductTailoringInStoreDraft.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "name",
                        ProductTailoringInStoreDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ProductTailoringInStoreDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaTitle",
                        ProductTailoringInStoreDraft.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductTailoringInStoreDraft.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductTailoringInStoreDraft.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductTailoringInStoreDraft.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "publish", ProductTailoringInStoreDraft.builder().publish(true) },
                new Object[] { "variants", ProductTailoringInStoreDraft.builder()
                        .variants(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftImpl())) },
                new Object[] { "attributes", ProductTailoringInStoreDraft.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl())) } };
    }

    @Test
    public void key() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void product() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void name() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaTitle() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void publish() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void variants() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setVariants(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftImpl()));
    }

    @Test
    public void attributes() {
        ProductTailoringInStoreDraft value = ProductTailoringInStoreDraft.of();
        value.setAttributes(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
    }
}
