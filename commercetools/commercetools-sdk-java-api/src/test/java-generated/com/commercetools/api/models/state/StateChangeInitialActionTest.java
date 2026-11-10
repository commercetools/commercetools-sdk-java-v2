
package com.commercetools.api.models.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateChangeInitialActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateChangeInitialActionBuilder builder) {
        StateChangeInitialAction stateChangeInitialAction = builder.buildUnchecked();
        Assertions.assertThat(stateChangeInitialAction).isInstanceOf(StateChangeInitialAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "initial", StateChangeInitialAction.builder().initial(true) } };
    }

    @Test
    public void initial() {
        StateChangeInitialAction value = StateChangeInitialAction.of();
        value.setInitial(true);
        Assertions.assertThat(value.getInitial()).isEqualTo(true);
    }
}
