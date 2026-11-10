
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeKeySetMessageBuilder builder) {
        DiscountCodeKeySetMessage discountCodeKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(discountCodeKeySetMessage).isInstanceOf(DiscountCodeKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountCodeKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", DiscountCodeKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        DiscountCodeKeySetMessage value = DiscountCodeKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        DiscountCodeKeySetMessage value = DiscountCodeKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
