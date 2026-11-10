
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateDraftBuilder builder) {
        AssociateDraft associateDraft = builder.buildUnchecked();
        Assertions.assertThat(associateDraft).isInstanceOf(AssociateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateRoleAssignments", AssociateDraft.builder()
                        .associateRoleAssignments(Collections.singletonList(
                            new com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl())) },
                new Object[] { "customer", AssociateDraft.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void associateRoleAssignments() {
        AssociateDraft value = AssociateDraft.of();
        value.setAssociateRoleAssignments(Collections
                .singletonList(new com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl()));
    }

    @Test
    public void customer() {
        AssociateDraft value = AssociateDraft.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
