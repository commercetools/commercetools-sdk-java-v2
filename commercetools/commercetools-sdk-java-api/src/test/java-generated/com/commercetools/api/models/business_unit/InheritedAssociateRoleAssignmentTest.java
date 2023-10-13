
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
public class InheritedAssociateRoleAssignmentTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InheritedAssociateRoleAssignmentBuilder builder) {
        InheritedAssociateRoleAssignment inheritedAssociateRoleAssignment = builder.buildUnchecked();
        Assertions.assertThat(inheritedAssociateRoleAssignment).isInstanceOf(InheritedAssociateRoleAssignment.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InheritedAssociateRoleAssignment.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl()) },
                new Object[] { InheritedAssociateRoleAssignment.builder()
                        .source(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void associateRole() {
        InheritedAssociateRoleAssignment value = InheritedAssociateRoleAssignment.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
    }

    @Test
    public void source() {
        InheritedAssociateRoleAssignment value = InheritedAssociateRoleAssignment.of();
        value.setSource(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getSource())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
