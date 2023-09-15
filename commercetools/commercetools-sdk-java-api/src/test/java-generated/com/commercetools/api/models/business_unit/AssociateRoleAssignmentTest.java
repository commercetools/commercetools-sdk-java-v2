
package com.commercetools.api.models.business_unit;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class AssociateRoleAssignmentTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleAssignmentBuilder builder) {
        AssociateRoleAssignment associateRoleAssignment = builder.buildUnchecked();
        Assertions.assertThat(associateRoleAssignment).isInstanceOf(AssociateRoleAssignment.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleAssignment.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl()) },
                new Object[] { AssociateRoleAssignment.builder()
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
