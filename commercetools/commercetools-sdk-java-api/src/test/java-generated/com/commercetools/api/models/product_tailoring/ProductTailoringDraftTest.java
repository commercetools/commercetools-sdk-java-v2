
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringDraftBuilder builder) {
        ProductTailoringDraft productTailoringDraft = builder.buildUnchecked();
        Assertions.assertThat(productTailoringDraft).isInstanceOf(ProductTailoringDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTailoringDraft.builder().key("key") },
                new Object[] { "store",
                        ProductTailoringDraft.builder()
                                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) },
                new Object[] { "product",
                        ProductTailoringDraft.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "name",
                        ProductTailoringDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ProductTailoringDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaTitle",
                        ProductTailoringDraft.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductTailoringDraft.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductTailoringDraft.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductTailoringDraft.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "publish", ProductTailoringDraft.builder().publish(true) },
                new Object[] { "variants", ProductTailoringDraft.builder()
                        .variants(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftImpl())) },
                new Object[] { "attributes", ProductTailoringDraft.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl())) } };
    }

    @Test
    public void key() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void store() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }

    @Test
    public void product() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void name() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaTitle() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void publish() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void variants() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setVariants(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftImpl()));
    }

    @Test
    public void attributes() {
        ProductTailoringDraft value = ProductTailoringDraft.of();
        value.setAttributes(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
    }
}
