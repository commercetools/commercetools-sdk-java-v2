
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidStateTransitionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidStateTransitionErrorBuilder builder) {
        InvalidStateTransitionError invalidStateTransitionError = builder.buildUnchecked();
        Assertions.assertThat(invalidStateTransitionError).isInstanceOf(InvalidStateTransitionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "currentState",
                        InvalidStateTransitionError.builder()
                                .currentState(
                                    com.commercetools.importapi.models.common.ProcessingState.findEnum("processing")) },
                new Object[] { "newState", InvalidStateTransitionError.builder()
                        .newState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing")) } };
    }

    @Test
    public void currentState() {
        InvalidStateTransitionError value = InvalidStateTransitionError.of();
        value.setCurrentState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
        Assertions.assertThat(value.getCurrentState())
                .isEqualTo(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
    }

    @Test
    public void newState() {
        InvalidStateTransitionError value = InvalidStateTransitionError.of();
        value.setNewState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
        Assertions.assertThat(value.getNewState())
                .isEqualTo(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
    }
}
