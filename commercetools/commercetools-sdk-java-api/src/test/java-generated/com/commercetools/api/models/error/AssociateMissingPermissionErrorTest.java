
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateMissingPermissionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateMissingPermissionErrorBuilder builder) {
        AssociateMissingPermissionError associateMissingPermissionError = builder.buildUnchecked();
        Assertions.assertThat(associateMissingPermissionError).isInstanceOf(AssociateMissingPermissionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AssociateMissingPermissionError.builder().message("message") },
                new Object[] { "associate", AssociateMissingPermissionError.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "businessUnit", AssociateMissingPermissionError.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "associateOnBehalf",
                        AssociateMissingPermissionError.builder()
                                .associateOnBehalf(
                                    new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "permissions", AssociateMissingPermissionError.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void message() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void associate() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void businessUnit() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void associateOnBehalf() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setAssociateOnBehalf(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateOnBehalf())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void permissions() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
