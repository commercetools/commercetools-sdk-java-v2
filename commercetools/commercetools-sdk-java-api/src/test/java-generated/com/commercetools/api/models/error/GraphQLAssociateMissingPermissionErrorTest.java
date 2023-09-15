
package com.commercetools.api.models.error;

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
public class GraphQLAssociateMissingPermissionErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLAssociateMissingPermissionErrorBuilder builder) {
        GraphQLAssociateMissingPermissionError graphQLAssociateMissingPermissionError = builder.buildUnchecked();
        Assertions.assertThat(graphQLAssociateMissingPermissionError)
                .isInstanceOf(GraphQLAssociateMissingPermissionError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLAssociateMissingPermissionError.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { GraphQLAssociateMissingPermissionError.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { GraphQLAssociateMissingPermissionError.builder()
                        .associateOnBehalf(
                            new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { GraphQLAssociateMissingPermissionError.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void associate() {
        GraphQLAssociateMissingPermissionError value = GraphQLAssociateMissingPermissionError.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void businessUnit() {
        GraphQLAssociateMissingPermissionError value = GraphQLAssociateMissingPermissionError.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void associateOnBehalf() {
        GraphQLAssociateMissingPermissionError value = GraphQLAssociateMissingPermissionError.of();
        value.setAssociateOnBehalf(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateOnBehalf())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void permissions() {
        GraphQLAssociateMissingPermissionError value = GraphQLAssociateMissingPermissionError.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
