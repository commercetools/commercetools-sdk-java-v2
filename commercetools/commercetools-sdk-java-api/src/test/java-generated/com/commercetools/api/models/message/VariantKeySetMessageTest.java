
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantKeySetMessageBuilder builder) {
        VariantKeySetMessage variantKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(variantKeySetMessage).isInstanceOf(VariantKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", VariantKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", VariantKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        VariantKeySetMessage value = VariantKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        VariantKeySetMessage value = VariantKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
