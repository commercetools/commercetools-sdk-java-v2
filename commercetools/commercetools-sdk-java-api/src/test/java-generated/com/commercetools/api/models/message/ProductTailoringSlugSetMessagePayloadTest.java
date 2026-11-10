
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSlugSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSlugSetMessagePayloadBuilder builder) {
        ProductTailoringSlugSetMessagePayload productTailoringSlugSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSlugSetMessagePayload)
                .isInstanceOf(ProductTailoringSlugSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringSlugSetMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringSlugSetMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringSlugSetMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "slug",
                        ProductTailoringSlugSetMessagePayload.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldSlug", ProductTailoringSlugSetMessagePayload.builder()
                        .oldSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringSlugSetMessagePayload value = ProductTailoringSlugSetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringSlugSetMessagePayload value = ProductTailoringSlugSetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringSlugSetMessagePayload value = ProductTailoringSlugSetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void slug() {
        ProductTailoringSlugSetMessagePayload value = ProductTailoringSlugSetMessagePayload.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldSlug() {
        ProductTailoringSlugSetMessagePayload value = ProductTailoringSlugSetMessagePayload.of();
        value.setOldSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
