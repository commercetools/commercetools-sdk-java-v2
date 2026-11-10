
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceDiscountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceDiscountSetMessageBuilder builder) {
        StandalonePriceDiscountSetMessage standalonePriceDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceDiscountSetMessage).isInstanceOf(StandalonePriceDiscountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discounted", StandalonePriceDiscountSetMessage.builder()
                .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) } };
    }

    @Test
    public void discounted() {
        StandalonePriceDiscountSetMessage value = StandalonePriceDiscountSetMessage.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }
}
