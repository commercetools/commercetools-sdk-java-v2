
package com.commercetools.importapi.models.business_units;

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
                new Object[] { "customer",
                        AssociateDraft.builder()
                                .customer(new com.commercetools.importapi.models.common.CustomerKeyReferenceImpl()) },
                new Object[] { "associateRoleAssignments", AssociateDraft.builder()
                        .associateRoleAssignments(Collections.singletonList(
                            new com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftImpl())) } };
    }

    @Test
    public void customer() {
        AssociateDraft value = AssociateDraft.of();
        value.setCustomer(new com.commercetools.importapi.models.common.CustomerKeyReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerKeyReferenceImpl());
    }

    @Test
    public void associateRoleAssignments() {
        AssociateDraft value = AssociateDraft.of();
        value.setAssociateRoleAssignments(Collections.singletonList(
            new com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftImpl()));
    }
}
