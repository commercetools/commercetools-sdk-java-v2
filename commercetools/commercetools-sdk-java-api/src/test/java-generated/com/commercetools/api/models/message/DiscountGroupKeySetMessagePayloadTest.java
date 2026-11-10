
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupKeySetMessagePayloadBuilder builder) {
        DiscountGroupKeySetMessagePayload discountGroupKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountGroupKeySetMessagePayload).isInstanceOf(DiscountGroupKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountGroupKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", DiscountGroupKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        DiscountGroupKeySetMessagePayload value = DiscountGroupKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        DiscountGroupKeySetMessagePayload value = DiscountGroupKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
