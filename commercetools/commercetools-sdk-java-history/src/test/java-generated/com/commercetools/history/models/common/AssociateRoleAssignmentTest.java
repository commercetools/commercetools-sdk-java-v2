
package com.commercetools.history.models.common;

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
        return new Object[][] {
                new Object[] { AssociateRoleAssignment.builder()
                        .associateRole(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { AssociateRoleAssignment.builder()
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
