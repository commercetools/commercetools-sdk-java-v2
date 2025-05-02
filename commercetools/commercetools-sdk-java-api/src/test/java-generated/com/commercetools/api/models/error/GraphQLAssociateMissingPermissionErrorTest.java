
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLAssociateMissingPermissionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLAssociateMissingPermissionErrorBuilder builder) {
        GraphQLAssociateMissingPermissionError graphQLAssociateMissingPermissionError = builder.buildUnchecked();
        Assertions.assertThat(graphQLAssociateMissingPermissionError)
                .isInstanceOf(GraphQLAssociateMissingPermissionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associate", GraphQLAssociateMissingPermissionError.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "businessUnit", GraphQLAssociateMissingPermissionError.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "associateOnBehalf",
                        GraphQLAssociateMissingPermissionError.builder()
                                .associateOnBehalf(
                                    new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "permissions", GraphQLAssociateMissingPermissionError.builder()
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
