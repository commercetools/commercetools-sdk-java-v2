
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeKeySetMessagePayloadBuilder builder) {
        DiscountCodeKeySetMessagePayload discountCodeKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountCodeKeySetMessagePayload).isInstanceOf(DiscountCodeKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountCodeKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", DiscountCodeKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        DiscountCodeKeySetMessagePayload value = DiscountCodeKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        DiscountCodeKeySetMessagePayload value = DiscountCodeKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
