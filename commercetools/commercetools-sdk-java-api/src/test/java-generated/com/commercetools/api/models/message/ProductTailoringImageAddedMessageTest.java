
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringImageAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringImageAddedMessageBuilder builder) {
        ProductTailoringImageAddedMessage productTailoringImageAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImageAddedMessage).isInstanceOf(ProductTailoringImageAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringImageAddedMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringImageAddedMessage.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringImageAddedMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductTailoringImageAddedMessage.builder().variantId(5L) },
                new Object[] { "image", ProductTailoringImageAddedMessage.builder()
                        .image(new com.commercetools.api.models.common.ImageImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringImageAddedMessage value = ProductTailoringImageAddedMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringImageAddedMessage value = ProductTailoringImageAddedMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringImageAddedMessage value = ProductTailoringImageAddedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductTailoringImageAddedMessage value = ProductTailoringImageAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void image() {
        ProductTailoringImageAddedMessage value = ProductTailoringImageAddedMessage.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }
}
