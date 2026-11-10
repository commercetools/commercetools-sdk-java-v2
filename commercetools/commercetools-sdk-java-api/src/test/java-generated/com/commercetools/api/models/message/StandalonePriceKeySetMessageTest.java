
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceKeySetMessageBuilder builder) {
        StandalonePriceKeySetMessage standalonePriceKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceKeySetMessage).isInstanceOf(StandalonePriceKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StandalonePriceKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", StandalonePriceKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        StandalonePriceKeySetMessage value = StandalonePriceKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        StandalonePriceKeySetMessage value = StandalonePriceKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
