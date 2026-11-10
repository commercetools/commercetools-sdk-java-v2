
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceExternalDiscountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceExternalDiscountSetMessageBuilder builder) {
        StandalonePriceExternalDiscountSetMessage standalonePriceExternalDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceExternalDiscountSetMessage)
                .isInstanceOf(StandalonePriceExternalDiscountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discounted", StandalonePriceExternalDiscountSetMessage.builder()
                .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) } };
    }

    @Test
    public void discounted() {
        StandalonePriceExternalDiscountSetMessage value = StandalonePriceExternalDiscountSetMessage.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }
}
