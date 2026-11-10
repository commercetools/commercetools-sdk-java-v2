
package com.commercetools.api.models.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateSetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateSetNameActionBuilder builder) {
        StateSetNameAction stateSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetNameAction).isInstanceOf(StateSetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name",
                StateSetNameAction.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        StateSetNameAction value = StateSetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
