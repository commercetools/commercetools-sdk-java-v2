
package com.commercetools.api.models.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateSetDescriptionActionBuilder builder) {
        StateSetDescriptionAction stateSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetDescriptionAction).isInstanceOf(StateSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description", StateSetDescriptionAction.builder()
                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        StateSetDescriptionAction value = StateSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
