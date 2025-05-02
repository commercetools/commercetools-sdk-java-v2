
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringImagesSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringImagesSetMessageBuilder builder) {
        ProductTailoringImagesSetMessage productTailoringImagesSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImagesSetMessage).isInstanceOf(ProductTailoringImagesSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringImagesSetMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringImagesSetMessage.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringImagesSetMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductTailoringImagesSetMessage.builder().variantId(5L) },
                new Object[] { "oldImages", ProductTailoringImagesSetMessage.builder()
                        .oldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "images", ProductTailoringImagesSetMessage.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) } };
    }

    @Test
    public void store() {
        ProductTailoringImagesSetMessage value = ProductTailoringImagesSetMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringImagesSetMessage value = ProductTailoringImagesSetMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringImagesSetMessage value = ProductTailoringImagesSetMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductTailoringImagesSetMessage value = ProductTailoringImagesSetMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldImages() {
        ProductTailoringImagesSetMessage value = ProductTailoringImagesSetMessage.of();
        value.setOldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getOldImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void images() {
        ProductTailoringImagesSetMessage value = ProductTailoringImagesSetMessage.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }
}
