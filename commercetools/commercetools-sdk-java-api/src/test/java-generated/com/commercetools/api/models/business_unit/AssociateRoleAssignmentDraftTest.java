
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleAssignmentDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleAssignmentDraftBuilder builder) {
        AssociateRoleAssignmentDraft associateRoleAssignmentDraft = builder.buildUnchecked();
        Assertions.assertThat(associateRoleAssignmentDraft).isInstanceOf(AssociateRoleAssignmentDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole", AssociateRoleAssignmentDraft.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl()) },
                new Object[] { "inheritance",
                        AssociateRoleAssignmentDraft.builder()
                                .inheritance(com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode
                                        .findEnum("Enabled")) } };
    }

    @Test
    public void associateRole() {
        AssociateRoleAssignmentDraft value = AssociateRoleAssignmentDraft.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
    }

    @Test
    public void inheritance() {
        AssociateRoleAssignmentDraft value = AssociateRoleAssignmentDraft.of();
        value.setInheritance(
            com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode.findEnum("Enabled"));
        Assertions.assertThat(value.getInheritance())
                .isEqualTo(com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode.findEnum("Enabled"));
    }
}
