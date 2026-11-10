
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleAssignmentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleAssignmentBuilder builder) {
        AssociateRoleAssignment associateRoleAssignment = builder.buildUnchecked();
        Assertions.assertThat(associateRoleAssignment).isInstanceOf(AssociateRoleAssignment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateRole",
                        AssociateRoleAssignment.builder()
                                .associateRole(
                                    new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl()) },
                new Object[] { "inheritance",
                        AssociateRoleAssignment.builder()
                                .inheritance(com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode
                                        .findEnum("Enabled")) } };
    }

    @Test
    public void associateRole() {
        AssociateRoleAssignment value = AssociateRoleAssignment.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
    }

    @Test
    public void inheritance() {
        AssociateRoleAssignment value = AssociateRoleAssignment.of();
        value.setInheritance(
            com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode.findEnum("Enabled"));
        Assertions.assertThat(value.getInheritance())
                .isEqualTo(com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode.findEnum("Enabled"));
    }
}
