
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateKeyReferenceBuilder builder) {
        StateKeyReference stateKeyReference = builder.buildUnchecked();
        Assertions.assertThat(stateKeyReference).isInstanceOf(StateKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StateKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        StateKeyReference value = StateKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
