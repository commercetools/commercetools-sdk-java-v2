
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
public class BusinessUnitAssociateResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAssociateResponseBuilder builder) {
        BusinessUnitAssociateResponse businessUnitAssociateResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociateResponse).isInstanceOf(BusinessUnitAssociateResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAssociateResponse.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { BusinessUnitAssociateResponse.builder()
                        .associateRoles(Collections
                                .singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl())) },
                new Object[] { BusinessUnitAssociateResponse.builder()
                        .inheritedAssociateRoles(Collections
                                .singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl())) },
                new Object[] { BusinessUnitAssociateResponse.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void customer() {
        BusinessUnitAssociateResponse value = BusinessUnitAssociateResponse.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void associateRoles() {
        BusinessUnitAssociateResponse value = BusinessUnitAssociateResponse.of();
        value.setAssociateRoles(
            Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl()));
        Assertions.assertThat(value.getAssociateRoles())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl()));
    }

    @Test
    public void inheritedAssociateRoles() {
        BusinessUnitAssociateResponse value = BusinessUnitAssociateResponse.of();
        value.setInheritedAssociateRoles(
            Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl()));
        Assertions.assertThat(value.getInheritedAssociateRoles())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl()));
    }

    @Test
    public void permissions() {
        BusinessUnitAssociateResponse value = BusinessUnitAssociateResponse.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
