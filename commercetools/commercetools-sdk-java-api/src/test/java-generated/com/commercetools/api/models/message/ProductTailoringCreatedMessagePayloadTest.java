
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringCreatedMessagePayloadBuilder builder) {
        ProductTailoringCreatedMessagePayload productTailoringCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringCreatedMessagePayload)
                .isInstanceOf(ProductTailoringCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTailoringCreatedMessagePayload.builder().key("key") },
                new Object[] { "store",
                        ProductTailoringCreatedMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringCreatedMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringCreatedMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "description",
                        ProductTailoringCreatedMessagePayload.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "name",
                        ProductTailoringCreatedMessagePayload.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductTailoringCreatedMessagePayload.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaTitle",
                        ProductTailoringCreatedMessagePayload.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductTailoringCreatedMessagePayload.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductTailoringCreatedMessagePayload.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "variants", ProductTailoringCreatedMessagePayload.builder()
                        .variants(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl())) },
                new Object[] { "published", ProductTailoringCreatedMessagePayload.builder().published(true) } };
    }

    @Test
    public void key() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void store() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void description() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void name() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaTitle() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void variants() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setVariants(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl()));
    }

    @Test
    public void published() {
        ProductTailoringCreatedMessagePayload value = ProductTailoringCreatedMessagePayload.of();
        value.setPublished(true);
        Assertions.assertThat(value.getPublished()).isEqualTo(true);
    }
}
