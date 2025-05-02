
package com.commercetools.api.models.state;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateSetTransitionsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateSetTransitionsActionBuilder builder) {
        StateSetTransitionsAction stateSetTransitionsAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetTransitionsAction).isInstanceOf(StateSetTransitionsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "transitions",
                StateSetTransitionsAction.builder()
                        .transitions(Collections.singletonList(
                            new com.commercetools.api.models.state.StateResourceIdentifierImpl())) } };
    }

    @Test
    public void transitions() {
        StateSetTransitionsAction value = StateSetTransitionsAction.of();
        value.setTransitions(
            Collections.singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl()));
        Assertions.assertThat(value.getTransitions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl()));
    }
}
