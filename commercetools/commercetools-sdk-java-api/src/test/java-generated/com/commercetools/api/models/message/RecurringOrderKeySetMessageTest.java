
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderKeySetMessageBuilder builder) {
        RecurringOrderKeySetMessage recurringOrderKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderKeySetMessage).isInstanceOf(RecurringOrderKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringOrderKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", RecurringOrderKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        RecurringOrderKeySetMessage value = RecurringOrderKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        RecurringOrderKeySetMessage value = RecurringOrderKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
