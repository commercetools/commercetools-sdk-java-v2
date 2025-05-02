
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateBuilder builder) {
        Associate associate = builder.buildUnchecked();
        Assertions.assertThat(associate).isInstanceOf(Associate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateRoleAssignments",
                        Associate.builder()
                                .associateRoleAssignments(Collections.singletonList(
                                    new com.commercetools.api.models.business_unit.AssociateRoleAssignmentImpl())) },
                new Object[] { "customer", Associate.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void associateRoleAssignments() {
        Associate value = Associate.of();
        value.setAssociateRoleAssignments(
            Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateRoleAssignmentImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.business_unit.AssociateRoleAssignmentImpl()));
    }

    @Test
    public void customer() {
        Associate value = Associate.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
