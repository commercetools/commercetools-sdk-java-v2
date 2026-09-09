
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSkuSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSkuSetMessageBuilder builder) {
        VariantSkuSetMessage variantSkuSetMessage = builder.buildUnchecked();
        Assertions.assertThat(variantSkuSetMessage).isInstanceOf(VariantSkuSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        VariantSkuSetMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "sku", VariantSkuSetMessage.builder().sku("sku") },
                new Object[] { "oldSku", VariantSkuSetMessage.builder().oldSku("oldSku") },
                new Object[] { "staged", VariantSkuSetMessage.builder().staged(true) } };
    }

    @Test
    public void product() {
        VariantSkuSetMessage value = VariantSkuSetMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void sku() {
        VariantSkuSetMessage value = VariantSkuSetMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void oldSku() {
        VariantSkuSetMessage value = VariantSkuSetMessage.of();
        value.setOldSku("oldSku");
        Assertions.assertThat(value.getOldSku()).isEqualTo("oldSku");
    }

    @Test
    public void staged() {
        VariantSkuSetMessage value = VariantSkuSetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
