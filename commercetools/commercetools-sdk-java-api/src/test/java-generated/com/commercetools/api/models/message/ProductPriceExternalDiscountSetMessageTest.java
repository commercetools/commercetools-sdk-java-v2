
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceExternalDiscountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceExternalDiscountSetMessageBuilder builder) {
        ProductPriceExternalDiscountSetMessage productPriceExternalDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceExternalDiscountSetMessage)
                .isInstanceOf(ProductPriceExternalDiscountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductPriceExternalDiscountSetMessage.builder().variantId(5) },
                new Object[] { "variantKey",
                        ProductPriceExternalDiscountSetMessage.builder().variantKey("variantKey") },
                new Object[] { "sku", ProductPriceExternalDiscountSetMessage.builder().sku("sku") },
                new Object[] { "priceId", ProductPriceExternalDiscountSetMessage.builder().priceId("priceId") },
                new Object[] { "discounted",
                        ProductPriceExternalDiscountSetMessage.builder()
                                .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] { "staged", ProductPriceExternalDiscountSetMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void variantKey() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setVariantKey("variantKey");
        Assertions.assertThat(value.getVariantKey()).isEqualTo("variantKey");
    }

    @Test
    public void sku() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void priceId() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void discounted() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
