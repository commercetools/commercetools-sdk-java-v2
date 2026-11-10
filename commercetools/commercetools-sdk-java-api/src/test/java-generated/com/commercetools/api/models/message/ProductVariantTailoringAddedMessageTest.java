
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringAddedMessageBuilder builder) {
        ProductVariantTailoringAddedMessage productVariantTailoringAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productVariantTailoringAddedMessage)
                .isInstanceOf(ProductVariantTailoringAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductVariantTailoringAddedMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductVariantTailoringAddedMessage.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductVariantTailoringAddedMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductVariantTailoringAddedMessage.builder().variantId(5L) },
                new Object[] { "variant", ProductVariantTailoringAddedMessage.builder()
                        .variant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl()) } };
    }

    @Test
    public void store() {
        ProductVariantTailoringAddedMessage value = ProductVariantTailoringAddedMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductVariantTailoringAddedMessage value = ProductVariantTailoringAddedMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductVariantTailoringAddedMessage value = ProductVariantTailoringAddedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductVariantTailoringAddedMessage value = ProductVariantTailoringAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void variant() {
        ProductVariantTailoringAddedMessage value = ProductVariantTailoringAddedMessage.of();
        value.setVariant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
    }
}
