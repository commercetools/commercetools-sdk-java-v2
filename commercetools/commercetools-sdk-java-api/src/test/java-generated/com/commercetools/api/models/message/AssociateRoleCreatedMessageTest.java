
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleCreatedMessageBuilder builder) {
        AssociateRoleCreatedMessage associateRoleCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(associateRoleCreatedMessage).isInstanceOf(AssociateRoleCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole", AssociateRoleCreatedMessage.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleImpl()) } };
    }

    @Test
    public void associateRole() {
        AssociateRoleCreatedMessage value = AssociateRoleCreatedMessage.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
    }
}
