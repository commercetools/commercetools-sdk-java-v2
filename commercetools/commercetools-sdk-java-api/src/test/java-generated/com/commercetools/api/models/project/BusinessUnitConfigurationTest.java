
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
public class BusinessUnitConfigurationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitConfigurationBuilder builder) {
        BusinessUnitConfiguration businessUnitConfiguration = builder.buildUnchecked();
        Assertions.assertThat(businessUnitConfiguration).isInstanceOf(BusinessUnitConfiguration.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitConfiguration.builder()
                        .myBusinessUnitStatusOnCreation(
                            com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active")) },
                new Object[] { BusinessUnitConfiguration.builder()
                        .myBusinessUnitAssociateRoleOnCreation(
                            new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl()) } };
    }

    @Test
    public void myBusinessUnitStatusOnCreation() {
        BusinessUnitConfiguration value = BusinessUnitConfiguration.of();
        value.setMyBusinessUnitStatusOnCreation(
            com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active"));
        Assertions.assertThat(value.getMyBusinessUnitStatusOnCreation())
                .isEqualTo(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active"));
    }

    @Test
    public void myBusinessUnitAssociateRoleOnCreation() {
        BusinessUnitConfiguration value = BusinessUnitConfiguration.of();
        value.setMyBusinessUnitAssociateRoleOnCreation(
            new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
        Assertions.assertThat(value.getMyBusinessUnitAssociateRoleOnCreation())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
    }
}
