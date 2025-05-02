
package com.commercetools.api.models.state;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateUpdateBuilder builder) {
        StateUpdate stateUpdate = builder.buildUnchecked();
        Assertions.assertThat(stateUpdate).isInstanceOf(StateUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", StateUpdate.builder().version(2L) }, new Object[] { "actions",
                StateUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.state.StateUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StateUpdate value = StateUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StateUpdate value = StateUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.state.StateUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.state.StateUpdateActionImpl()));
    }
}
