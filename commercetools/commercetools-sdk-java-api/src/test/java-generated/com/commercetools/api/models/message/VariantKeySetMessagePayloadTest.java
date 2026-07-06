
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantKeySetMessagePayloadBuilder builder) {
        VariantKeySetMessagePayload variantKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(variantKeySetMessagePayload).isInstanceOf(VariantKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", VariantKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", VariantKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        VariantKeySetMessagePayload value = VariantKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        VariantKeySetMessagePayload value = VariantKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
