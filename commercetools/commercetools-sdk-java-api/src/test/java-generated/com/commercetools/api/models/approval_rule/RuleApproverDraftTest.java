
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RuleApproverDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RuleApproverDraftBuilder builder) {
        RuleApproverDraft ruleApproverDraft = builder.buildUnchecked();
        Assertions.assertThat(ruleApproverDraft).isInstanceOf(RuleApproverDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole",
                RuleApproverDraft.builder()
                        .associateRole(
                            new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl()) } };
    }

    @Test
    public void associateRole() {
        RuleApproverDraft value = RuleApproverDraft.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
    }
}
