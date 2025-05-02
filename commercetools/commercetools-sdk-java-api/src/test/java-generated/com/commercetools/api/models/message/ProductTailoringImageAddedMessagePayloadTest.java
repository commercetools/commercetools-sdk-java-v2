
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringImageAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringImageAddedMessagePayloadBuilder builder) {
        ProductTailoringImageAddedMessagePayload productTailoringImageAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImageAddedMessagePayload)
                .isInstanceOf(ProductTailoringImageAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringImageAddedMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey",
                        ProductTailoringImageAddedMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringImageAddedMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductTailoringImageAddedMessagePayload.builder().variantId(5L) },
                new Object[] { "image", ProductTailoringImageAddedMessagePayload.builder()
                        .image(new com.commercetools.api.models.common.ImageImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringImageAddedMessagePayload value = ProductTailoringImageAddedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringImageAddedMessagePayload value = ProductTailoringImageAddedMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringImageAddedMessagePayload value = ProductTailoringImageAddedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductTailoringImageAddedMessagePayload value = ProductTailoringImageAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void image() {
        ProductTailoringImageAddedMessagePayload value = ProductTailoringImageAddedMessagePayload.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }
}
