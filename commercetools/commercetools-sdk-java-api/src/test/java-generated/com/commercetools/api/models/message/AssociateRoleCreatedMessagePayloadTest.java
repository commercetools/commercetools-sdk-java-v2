
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleCreatedMessagePayloadBuilder builder) {
        AssociateRoleCreatedMessagePayload associateRoleCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(associateRoleCreatedMessagePayload)
                .isInstanceOf(AssociateRoleCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole", AssociateRoleCreatedMessagePayload.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleImpl()) } };
    }

    @Test
    public void associateRole() {
        AssociateRoleCreatedMessagePayload value = AssociateRoleCreatedMessagePayload.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
    }
}
