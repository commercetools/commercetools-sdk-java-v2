
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeKeyReferenceBuilder builder) {
        DiscountCodeKeyReference discountCodeKeyReference = builder.buildUnchecked();
        Assertions.assertThat(discountCodeKeyReference).isInstanceOf(DiscountCodeKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountCodeKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        DiscountCodeKeyReference value = DiscountCodeKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
