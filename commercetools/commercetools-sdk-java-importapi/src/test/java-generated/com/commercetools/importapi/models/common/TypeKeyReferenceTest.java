
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeKeyReferenceBuilder builder) {
        TypeKeyReference typeKeyReference = builder.buildUnchecked();
        Assertions.assertThat(typeKeyReference).isInstanceOf(TypeKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TypeKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        TypeKeyReference value = TypeKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
