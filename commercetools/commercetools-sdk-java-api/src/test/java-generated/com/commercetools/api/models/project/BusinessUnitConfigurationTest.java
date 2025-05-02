
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitConfigurationBuilder builder) {
        BusinessUnitConfiguration businessUnitConfiguration = builder.buildUnchecked();
        Assertions.assertThat(businessUnitConfiguration).isInstanceOf(BusinessUnitConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "myBusinessUnitStatusOnCreation", BusinessUnitConfiguration.builder()
                        .myBusinessUnitStatusOnCreation(
                            com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active")) },
                new Object[] { "myBusinessUnitAssociateRoleOnCreation", BusinessUnitConfiguration.builder()
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
