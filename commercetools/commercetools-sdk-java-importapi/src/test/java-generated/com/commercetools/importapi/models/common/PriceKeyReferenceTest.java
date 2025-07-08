
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceKeyReferenceBuilder builder) {
        PriceKeyReference priceKeyReference = builder.buildUnchecked();
        Assertions.assertThat(priceKeyReference).isInstanceOf(PriceKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PriceKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        PriceKeyReference value = PriceKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
