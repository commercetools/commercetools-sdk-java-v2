
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringRemovedMessageBuilder builder) {
        ProductVariantTailoringRemovedMessage productVariantTailoringRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(productVariantTailoringRemovedMessage)
                .isInstanceOf(ProductVariantTailoringRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductVariantTailoringRemovedMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductVariantTailoringRemovedMessage.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductVariantTailoringRemovedMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductVariantTailoringRemovedMessage.builder().variantId(5L) },
                new Object[] { "variant", ProductVariantTailoringRemovedMessage.builder()
                        .variant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl()) } };
    }

    @Test
    public void store() {
        ProductVariantTailoringRemovedMessage value = ProductVariantTailoringRemovedMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductVariantTailoringRemovedMessage value = ProductVariantTailoringRemovedMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductVariantTailoringRemovedMessage value = ProductVariantTailoringRemovedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductVariantTailoringRemovedMessage value = ProductVariantTailoringRemovedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void variant() {
        ProductVariantTailoringRemovedMessage value = ProductVariantTailoringRemovedMessage.of();
        value.setVariant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
    }
}
