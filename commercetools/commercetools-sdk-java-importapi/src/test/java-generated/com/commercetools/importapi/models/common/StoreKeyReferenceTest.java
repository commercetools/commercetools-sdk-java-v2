
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreKeyReferenceBuilder builder) {
        StoreKeyReference storeKeyReference = builder.buildUnchecked();
        Assertions.assertThat(storeKeyReference).isInstanceOf(StoreKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StoreKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        StoreKeyReference value = StoreKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
