
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
public class AssociateRoleAssignmentDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleAssignmentDraftBuilder builder) {
        AssociateRoleAssignmentDraft associateRoleAssignmentDraft = builder.buildUnchecked();
        Assertions.assertThat(associateRoleAssignmentDraft).isInstanceOf(AssociateRoleAssignmentDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleAssignmentDraft.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl()) },
                new Object[] { AssociateRoleAssignmentDraft.builder()
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
