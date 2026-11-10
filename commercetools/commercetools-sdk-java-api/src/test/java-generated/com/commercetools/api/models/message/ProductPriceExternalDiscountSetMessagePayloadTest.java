
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceExternalDiscountSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceExternalDiscountSetMessagePayloadBuilder builder) {
        ProductPriceExternalDiscountSetMessagePayload productPriceExternalDiscountSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceExternalDiscountSetMessagePayload)
                .isInstanceOf(ProductPriceExternalDiscountSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductPriceExternalDiscountSetMessagePayload.builder().variantId(5) },
                new Object[] { "variantKey",
                        ProductPriceExternalDiscountSetMessagePayload.builder().variantKey("variantKey") },
                new Object[] { "sku", ProductPriceExternalDiscountSetMessagePayload.builder().sku("sku") },
                new Object[] { "priceId", ProductPriceExternalDiscountSetMessagePayload.builder().priceId("priceId") },
                new Object[] { "discounted",
                        ProductPriceExternalDiscountSetMessagePayload.builder()
                                .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] { "staged", ProductPriceExternalDiscountSetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void variantKey() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setVariantKey("variantKey");
        Assertions.assertThat(value.getVariantKey()).isEqualTo("variantKey");
    }

    @Test
    public void sku() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void priceId() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void discounted() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
