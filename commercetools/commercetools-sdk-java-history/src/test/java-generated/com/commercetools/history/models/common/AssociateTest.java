
package com.commercetools.history.models.common;

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
                                    new com.commercetools.history.models.common.AssociateRoleAssignmentImpl())) },
                new Object[] { "customer",
                        Associate.builder().customer(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void associateRoleAssignments() {
        Associate value = Associate.of();
        value.setAssociateRoleAssignments(
            Collections.singletonList(new com.commercetools.history.models.common.AssociateRoleAssignmentImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.AssociateRoleAssignmentImpl()));
    }

    @Test
    public void customer() {
        Associate value = Associate.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
