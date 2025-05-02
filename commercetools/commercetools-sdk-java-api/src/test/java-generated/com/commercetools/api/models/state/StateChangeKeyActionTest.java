
package com.commercetools.api.models.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateChangeKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateChangeKeyActionBuilder builder) {
        StateChangeKeyAction stateChangeKeyAction = builder.buildUnchecked();
        Assertions.assertThat(stateChangeKeyAction).isInstanceOf(StateChangeKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StateChangeKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        StateChangeKeyAction value = StateChangeKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
