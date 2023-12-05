
package com.commercetools.api.models.project;

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
public class ProjectSetBusinessUnitAssociateRoleOnCreationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder builder) {
        ProjectSetBusinessUnitAssociateRoleOnCreationAction projectSetBusinessUnitAssociateRoleOnCreationAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectSetBusinessUnitAssociateRoleOnCreationAction)
                .isInstanceOf(ProjectSetBusinessUnitAssociateRoleOnCreationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectSetBusinessUnitAssociateRoleOnCreationAction.builder()
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
