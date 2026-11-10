
package com.commercetools.api.models.state;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateSetRolesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateSetRolesActionBuilder builder) {
        StateSetRolesAction stateSetRolesAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetRolesAction).isInstanceOf(StateSetRolesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "roles", StateSetRolesAction.builder()
                .roles(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void roles() {
        StateSetRolesAction value = StateSetRolesAction.of();
        value.setRoles(Collections.singletonList(
            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
