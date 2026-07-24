
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringKeySetMessageBuilder builder) {
        ProductTailoringKeySetMessage productTailoringKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(productTailoringKeySetMessage).isInstanceOf(ProductTailoringKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringKeySetMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringKeySetMessage.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringKeySetMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "key", ProductTailoringKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", ProductTailoringKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void store() {
        ProductTailoringKeySetMessage value = ProductTailoringKeySetMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringKeySetMessage value = ProductTailoringKeySetMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringKeySetMessage value = ProductTailoringKeySetMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void key() {
        ProductTailoringKeySetMessage value = ProductTailoringKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        ProductTailoringKeySetMessage value = ProductTailoringKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
