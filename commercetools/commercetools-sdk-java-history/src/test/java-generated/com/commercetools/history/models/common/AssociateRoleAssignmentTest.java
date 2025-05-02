
package com.commercetools.history.models.common;

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
                                .associateRole(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { "inheritance",
                        AssociateRoleAssignment.builder()
                                .inheritance(com.commercetools.history.models.common.AssociateRoleInheritanceMode
                                        .findEnum("Enabled")) } };
    }

    @Test
    public void associateRole() {
        AssociateRoleAssignment value = AssociateRoleAssignment.of();
        value.setAssociateRole(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }

    @Test
    public void inheritance() {
        AssociateRoleAssignment value = AssociateRoleAssignment.of();
        value.setInheritance(com.commercetools.history.models.common.AssociateRoleInheritanceMode.findEnum("Enabled"));
        Assertions.assertThat(value.getInheritance())
                .isEqualTo(com.commercetools.history.models.common.AssociateRoleInheritanceMode.findEnum("Enabled"));
    }
}
