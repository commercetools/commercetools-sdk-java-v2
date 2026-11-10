
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPricesSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPricesSetMessageBuilder builder) {
        ProductPricesSetMessage productPricesSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPricesSetMessage).isInstanceOf(ProductPricesSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPricesSetMessage.builder().variantId(5L) },
                new Object[] { "prices", ProductPricesSetMessage.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl())) },
                new Object[] { "staged", ProductPricesSetMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPricesSetMessage value = ProductPricesSetMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void prices() {
        ProductPricesSetMessage value = ProductPricesSetMessage.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
    }

    @Test
    public void staged() {
        ProductPricesSetMessage value = ProductPricesSetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
