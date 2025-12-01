
package com.commercetools.history.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InheritedAssociateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InheritedAssociateBuilder builder) {
        InheritedAssociate inheritedAssociate = builder.buildUnchecked();
        Assertions.assertThat(inheritedAssociate).isInstanceOf(InheritedAssociate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateRoleAssignments", InheritedAssociate.builder()
                        .associateRoleAssignments(Collections.singletonList(
                            new com.commercetools.history.models.common.InheritedAssociateRoleAssignmentImpl())) },
                new Object[] { "customer", InheritedAssociate.builder()
                        .customer(new com.commercetools.history.models.common.CustomerReferenceImpl()) } };
    }

    @Test
    public void associateRoleAssignments() {
        InheritedAssociate value = InheritedAssociate.of();
        value.setAssociateRoleAssignments(Collections
                .singletonList(new com.commercetools.history.models.common.InheritedAssociateRoleAssignmentImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.common.InheritedAssociateRoleAssignmentImpl()));
    }

    @Test
    public void customer() {
        InheritedAssociate value = InheritedAssociate.of();
        value.setCustomer(new com.commercetools.history.models.common.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.CustomerReferenceImpl());
    }
}
