
package com.commercetools.api.models.state;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateAddRolesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateAddRolesActionBuilder builder) {
        StateAddRolesAction stateAddRolesAction = builder.buildUnchecked();
        Assertions.assertThat(stateAddRolesAction).isInstanceOf(StateAddRolesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "roles", StateAddRolesAction.builder()
                .roles(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void roles() {
        StateAddRolesAction value = StateAddRolesAction.of();
        value.setRoles(Collections.singletonList(
            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
