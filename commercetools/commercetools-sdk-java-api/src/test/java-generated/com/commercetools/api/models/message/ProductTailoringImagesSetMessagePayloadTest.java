
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringImagesSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringImagesSetMessagePayloadBuilder builder) {
        ProductTailoringImagesSetMessagePayload productTailoringImagesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImagesSetMessagePayload)
                .isInstanceOf(ProductTailoringImagesSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringImagesSetMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey",
                        ProductTailoringImagesSetMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringImagesSetMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductTailoringImagesSetMessagePayload.builder().variantId(5L) },
                new Object[] { "oldImages", ProductTailoringImagesSetMessagePayload.builder()
                        .oldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "images", ProductTailoringImagesSetMessagePayload.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) } };
    }

    @Test
    public void store() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldImages() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setOldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getOldImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void images() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }
}
