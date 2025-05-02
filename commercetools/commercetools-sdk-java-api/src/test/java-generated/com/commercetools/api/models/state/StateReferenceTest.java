
package com.commercetools.api.models.state;

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
        return new Object[][] {
                new Object[] { "obj",
                        StateReference.builder().obj(new com.commercetools.api.models.state.StateImpl()) },
                new Object[] { "id", StateReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        StateReference value = StateReference.of();
        value.setObj(new com.commercetools.api.models.state.StateImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.state.StateImpl());
    }

    @Test
    public void id() {
        StateReference value = StateReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
