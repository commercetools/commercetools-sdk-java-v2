
package com.commercetools.api.models.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateResourceIdentifierBuilder builder) {
        StateResourceIdentifier stateResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(stateResourceIdentifier).isInstanceOf(StateResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", StateResourceIdentifier.builder().id("id") },
                new Object[] { "key", StateResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        StateResourceIdentifier value = StateResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        StateResourceIdentifier value = StateResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
