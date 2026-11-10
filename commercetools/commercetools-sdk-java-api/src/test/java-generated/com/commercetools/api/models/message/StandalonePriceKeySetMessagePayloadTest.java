
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceKeySetMessagePayloadBuilder builder) {
        StandalonePriceKeySetMessagePayload standalonePriceKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceKeySetMessagePayload)
                .isInstanceOf(StandalonePriceKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StandalonePriceKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", StandalonePriceKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        StandalonePriceKeySetMessagePayload value = StandalonePriceKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        StandalonePriceKeySetMessagePayload value = StandalonePriceKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
