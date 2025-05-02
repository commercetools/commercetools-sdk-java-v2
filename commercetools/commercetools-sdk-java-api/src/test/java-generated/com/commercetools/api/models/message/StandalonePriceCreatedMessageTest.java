
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceCreatedMessageBuilder builder) {
        StandalonePriceCreatedMessage standalonePriceCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceCreatedMessage).isInstanceOf(StandalonePriceCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "standalonePrice", StandalonePriceCreatedMessage.builder()
                .standalonePrice(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()) } };
    }

    @Test
    public void standalonePrice() {
        StandalonePriceCreatedMessage value = StandalonePriceCreatedMessage.of();
        value.setStandalonePrice(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
        Assertions.assertThat(value.getStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
    }
}
