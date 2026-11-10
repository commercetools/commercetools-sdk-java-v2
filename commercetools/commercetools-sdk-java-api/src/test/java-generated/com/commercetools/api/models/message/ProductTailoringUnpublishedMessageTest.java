
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringUnpublishedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringUnpublishedMessageBuilder builder) {
        ProductTailoringUnpublishedMessage productTailoringUnpublishedMessage = builder.buildUnchecked();
        Assertions.assertThat(productTailoringUnpublishedMessage)
                .isInstanceOf(ProductTailoringUnpublishedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringUnpublishedMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringUnpublishedMessage.builder().productKey("productKey") },
                new Object[] { "product", ProductTailoringUnpublishedMessage.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringUnpublishedMessage value = ProductTailoringUnpublishedMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringUnpublishedMessage value = ProductTailoringUnpublishedMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringUnpublishedMessage value = ProductTailoringUnpublishedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
