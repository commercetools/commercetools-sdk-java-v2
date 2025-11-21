
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InheritedAssociateRoleAssignmentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InheritedAssociateRoleAssignmentBuilder builder) {
        InheritedAssociateRoleAssignment inheritedAssociateRoleAssignment = builder.buildUnchecked();
        Assertions.assertThat(inheritedAssociateRoleAssignment).isInstanceOf(InheritedAssociateRoleAssignment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateRole", InheritedAssociateRoleAssignment.builder()
                        .associateRole(new com.commercetools.history.models.common.AssociateRoleKeyReferenceImpl()) },
                new Object[] { "source", InheritedAssociateRoleAssignment.builder()
                        .source(new com.commercetools.history.models.common.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void associateRole() {
        InheritedAssociateRoleAssignment value = InheritedAssociateRoleAssignment.of();
        value.setAssociateRole(new com.commercetools.history.models.common.AssociateRoleKeyReferenceImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.history.models.common.AssociateRoleKeyReferenceImpl());
    }

    @Test
    public void source() {
        InheritedAssociateRoleAssignment value = InheritedAssociateRoleAssignment.of();
        value.setSource(new com.commercetools.history.models.common.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getSource())
                .isEqualTo(new com.commercetools.history.models.common.BusinessUnitKeyReferenceImpl());
    }
}
