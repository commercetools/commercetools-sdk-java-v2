
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupKeySetMessageBuilder builder) {
        DiscountGroupKeySetMessage discountGroupKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(discountGroupKeySetMessage).isInstanceOf(DiscountGroupKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountGroupKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", DiscountGroupKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        DiscountGroupKeySetMessage value = DiscountGroupKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        DiscountGroupKeySetMessage value = DiscountGroupKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
