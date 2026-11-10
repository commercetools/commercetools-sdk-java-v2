
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringKeySetMessagePayloadBuilder builder) {
        ProductTailoringKeySetMessagePayload productTailoringKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringKeySetMessagePayload)
                .isInstanceOf(ProductTailoringKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringKeySetMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringKeySetMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringKeySetMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "key", ProductTailoringKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", ProductTailoringKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void store() {
        ProductTailoringKeySetMessagePayload value = ProductTailoringKeySetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringKeySetMessagePayload value = ProductTailoringKeySetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringKeySetMessagePayload value = ProductTailoringKeySetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void key() {
        ProductTailoringKeySetMessagePayload value = ProductTailoringKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        ProductTailoringKeySetMessagePayload value = ProductTailoringKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
