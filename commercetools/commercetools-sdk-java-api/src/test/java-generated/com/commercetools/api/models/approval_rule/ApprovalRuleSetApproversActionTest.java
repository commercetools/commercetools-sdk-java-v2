
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetApproversActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetApproversActionBuilder builder) {
        ApprovalRuleSetApproversAction approvalRuleSetApproversAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetApproversAction).isInstanceOf(ApprovalRuleSetApproversAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "approvers", ApprovalRuleSetApproversAction.builder()
                .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl()) } };
    }

    @Test
    public void approvers() {
        ApprovalRuleSetApproversAction value = ApprovalRuleSetApproversAction.of();
        value.setApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl());
        Assertions.assertThat(value.getApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl());
    }
}
