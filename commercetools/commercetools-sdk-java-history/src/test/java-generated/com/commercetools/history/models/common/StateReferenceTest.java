
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateReferenceBuilder builder) {
        StateReference stateReference = builder.buildUnchecked();
        Assertions.assertThat(stateReference).isInstanceOf(StateReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", StateReference.builder().id("id") } };
    }

    @Test
    public void id() {
        StateReference value = StateReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
