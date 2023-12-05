
package com.commercetools.api.models.business_unit;

import java.util.Collections;

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
public class InheritedAssociateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InheritedAssociateBuilder builder) {
        InheritedAssociate inheritedAssociate = builder.buildUnchecked();
        Assertions.assertThat(inheritedAssociate).isInstanceOf(InheritedAssociate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { InheritedAssociate.builder()
                        .associateRoleAssignments(Collections.singletonList(
                            new com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignmentImpl())) },
                new Object[] { InheritedAssociate.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void associateRoleAssignments() {
        InheritedAssociate value = InheritedAssociate.of();
        value.setAssociateRoleAssignments(Collections
                .singletonList(new com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignmentImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignmentImpl()));
    }

    @Test
    public void customer() {
        InheritedAssociate value = InheritedAssociate.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
