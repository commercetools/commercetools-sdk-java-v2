
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetBusinessUnitAssociateRoleOnCreationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder builder) {
        ProjectSetBusinessUnitAssociateRoleOnCreationAction projectSetBusinessUnitAssociateRoleOnCreationAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectSetBusinessUnitAssociateRoleOnCreationAction)
                .isInstanceOf(ProjectSetBusinessUnitAssociateRoleOnCreationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole",
                ProjectSetBusinessUnitAssociateRoleOnCreationAction.builder()
                        .associateRole(
                            new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl()) } };
    }

    @Test
    public void associateRole() {
        ProjectSetBusinessUnitAssociateRoleOnCreationAction value = ProjectSetBusinessUnitAssociateRoleOnCreationAction
                .of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
    }
}
