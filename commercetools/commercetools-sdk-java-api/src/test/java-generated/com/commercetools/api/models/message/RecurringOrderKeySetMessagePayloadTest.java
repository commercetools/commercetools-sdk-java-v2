
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderKeySetMessagePayloadBuilder builder) {
        RecurringOrderKeySetMessagePayload recurringOrderKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderKeySetMessagePayload)
                .isInstanceOf(RecurringOrderKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringOrderKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", RecurringOrderKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        RecurringOrderKeySetMessagePayload value = RecurringOrderKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        RecurringOrderKeySetMessagePayload value = RecurringOrderKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
